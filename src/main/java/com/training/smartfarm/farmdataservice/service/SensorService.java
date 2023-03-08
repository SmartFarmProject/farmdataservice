package com.training.smartfarm.farmdataservice.service;

import com.training.smartfarm.farmdataservice.bo.SensorBO;
import com.training.smartfarm.farmdataservice.bo.UnitBO;
import com.training.smartfarm.farmdataservice.dto.SensorDTO;
import com.training.smartfarm.farmdataservice.repository.SensorRepository;
import com.training.smartfarm.farmdataservice.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.training.smartfarm.farmdataservice.mapper.MapperRegistry.SENSOR_MAPPER;
import static java.util.stream.Collectors.toList;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;
    @Autowired
    private UnitRepository unitRepository;


    @Transactional(readOnly = true)
    public SensorDTO findById(String id) {
        return SENSOR_MAPPER.sensorBOToSensorDTO(sensorRepository.findById(id).orElse(null));
    }


    @Transactional(readOnly = true)
    public List<SensorDTO> findByUnitId(String unitId) {
        return sensorRepository.findByUnitId(unitId).stream().map(SENSOR_MAPPER::sensorBOToSensorDTO).collect(toList());
    }

    @Transactional(readOnly = true)
    public List<SensorDTO> findByPhysicalIds(List<String> physicalIds) {
        return sensorRepository.findByPhysicalIdIn(physicalIds).stream().map(SENSOR_MAPPER::sensorBOToSensorDTO).collect(toList());
    }

    @Transactional
    public SensorDTO create(SensorDTO sensorDTO) {
        UnitBO unitBO = unitRepository.findById(sensorDTO.getUnitId()).orElse(null);
        if(unitBO == null) {
            return null;
        }

        SensorBO sensorBO = SENSOR_MAPPER.sensorDTOToSensorBO(sensorDTO);
        sensorBO.setUnit(unitBO);

        SensorBO newSensorBO = sensorRepository.save(sensorBO);
        return SENSOR_MAPPER.sensorBOToSensorDTO(newSensorBO);
    }

    @Transactional
    public SensorDTO update(SensorDTO sensorDTO) {
        SensorBO existingSensorBO = sensorRepository.findById(sensorDTO.getId()).orElse(null);
        UnitBO unitBO = unitRepository.findById(sensorDTO.getUnitId()).orElse(null);

        if(existingSensorBO == null || unitBO == null) {
            return null;
        }

        SensorBO newSensorBO = sensorRepository.save(SENSOR_MAPPER.sensorDTOToSensorBO(sensorDTO));
        return SENSOR_MAPPER.sensorBOToSensorDTO(newSensorBO);
    }

    @Transactional
    public SensorDTO deleteById(String id) {
        SensorBO existingSensorBO = sensorRepository.findById(id).orElse(null);

        if(existingSensorBO == null) {
            return null;
        }

        sensorRepository.delete(existingSensorBO);
        return SENSOR_MAPPER.sensorBOToSensorDTO(existingSensorBO);
    }
}
