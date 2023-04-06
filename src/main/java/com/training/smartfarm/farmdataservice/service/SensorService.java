package com.training.smartfarm.farmdataservice.service;

import com.training.smartfarm.farmdataservice.bo.SensorBO;
import com.training.smartfarm.farmdataservice.bo.UnitBO;
import com.training.smartfarm.farmdataservice.dto.SensorDTO;
import com.training.smartfarm.farmdataservice.event.SensorEvent;
import com.training.smartfarm.farmdataservice.event.producer.SensorEventProducer;
import com.training.smartfarm.farmdataservice.repository.SensorRepository;
import com.training.smartfarm.farmdataservice.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.training.smartfarm.farmdataservice.event.SensorEvent.*;
import static com.training.smartfarm.farmdataservice.mapper.MapperRegistry.SENSOR_MAPPER;
import static java.util.stream.Collectors.toList;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;
    @Autowired
    private UnitRepository unitRepository;
    @Autowired
    private SensorEventProducer sensorEventProducer;


    @Transactional(readOnly = true)
    public SensorDTO findById(String id) {
        return SENSOR_MAPPER.sensorBOToSensorDTO(sensorRepository.findById(id).orElse(null));
    }


    @Transactional(readOnly = true)
    public List<SensorDTO> findByUnitId(String unitId) {
        return sensorRepository.findByUnitId(unitId).stream().map(SENSOR_MAPPER::sensorBOToSensorDTO).collect(toList());
    }

    @Transactional(readOnly = true)
    public List<SensorDTO> findAll() {
        return sensorRepository.findAll().stream().map(SENSOR_MAPPER::sensorBOToSensorDTO).collect(toList());
    }

    @Transactional(readOnly = true)
    public SensorDTO findByPhysicalId(String physicalId) {
        return SENSOR_MAPPER.sensorBOToSensorDTO(sensorRepository.findByPhysicalId(physicalId));
    }

    @Transactional
    public SensorDTO create(SensorDTO sensorDTO) {
        UnitBO unitBO = unitRepository.findById(sensorDTO.getUnitId()).orElse(null);
        if(unitBO == null) {
            return null;
        }

        SensorBO sensorBO = SENSOR_MAPPER.sensorDTOToSensorBO(sensorDTO);
//        sensorBO.setUnit(unitBO);

        SensorBO newSensorBO = sensorRepository.save(sensorBO);
        SensorDTO createdSensorDTO = SENSOR_MAPPER.sensorBOToSensorDTO(newSensorBO);
        pushSensorEvent(createdSensorDTO, CREATED_EVENT_TYPE);
        return createdSensorDTO;
    }

    @Transactional
    public SensorDTO update(SensorDTO sensorDTO) {
        SensorBO existingSensorBO = sensorRepository.findById(sensorDTO.getId()).orElse(null);
        UnitBO unitBO = unitRepository.findById(sensorDTO.getUnitId()).orElse(null);

        if(existingSensorBO == null || unitBO == null) {
            return null;
        }

        SensorBO newSensorBO = sensorRepository.save(SENSOR_MAPPER.sensorDTOToSensorBO(sensorDTO));
        SensorDTO updatedSensorDTO = SENSOR_MAPPER.sensorBOToSensorDTO(newSensorBO);
        pushSensorEvent(updatedSensorDTO, UPDATED_EVENT_TYPE);
        return updatedSensorDTO;
    }

    @Transactional
    public SensorDTO deleteById(String id) {
        SensorBO existingSensorBO = sensorRepository.findById(id).orElse(null);

        if(existingSensorBO == null) {
            return null;
        }

        sensorRepository.delete(existingSensorBO);

        SensorDTO deletedSensorDTO = SENSOR_MAPPER.sensorBOToSensorDTO(existingSensorBO);
        pushSensorEvent(deletedSensorDTO, DELETED_EVENT_TYPE);
        return deletedSensorDTO;
    }

    private void pushSensorEvent(SensorDTO sensorDTO, String eventType) {
        sensorEventProducer.sendMessage(SensorEvent.builder().eventType(eventType).sensorDTO(sensorDTO).build());
    }
}
