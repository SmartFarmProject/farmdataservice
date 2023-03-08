package com.training.smartfarm.farmdataservice.controller;

import com.training.smartfarm.farmdataservice.dto.SensorDTO;
import com.training.smartfarm.farmdataservice.dto.UnitDTO;
import com.training.smartfarm.farmdataservice.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
public class SensorController {

    @Autowired
    private SensorService sensorService;


    @GetMapping("/farms/{farmId}/units/{unitId}/sensors")
    public List<SensorDTO> findByFarmAndUnitId(@PathVariable String farmId, @PathVariable String unitId) {
        return sensorService.findByUnitId(unitId);
    }


    @GetMapping("/farms/{farmId}/units/{unitId}/sensors/{sensorId}")
    public ResponseEntity<SensorDTO> getById(@PathVariable String farmId, @PathVariable String unitId, @PathVariable String sensorId) {
        SensorDTO sensorDTO = sensorService.findById(sensorId);
        if(sensorDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(sensorDTO, OK);
        }
    }

    @GetMapping("/sensors")
    public List<SensorDTO> findByPhysicalIds(@RequestParam List<String> physicalIds) {
        return sensorService.findByPhysicalIds(physicalIds);
    }


    @PostMapping("/farms/{farmId}/units/{unitId}/sensors")
    public ResponseEntity<SensorDTO> create(@RequestBody SensorDTO sensorDTO, @PathVariable String farmId, @PathVariable String unitId) {
        sensorDTO.setUnitId(unitId);
        SensorDTO newSensorDTO = sensorService.create(sensorDTO);
        if(newSensorDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(newSensorDTO, CREATED);
        }
    }

    @PutMapping("/farms/{farmId}/units/{unitId}/sensors/{sensorId}")
    public ResponseEntity<SensorDTO> update(@RequestBody SensorDTO sensorDTO, @PathVariable String farmId, @PathVariable String unitId, @PathVariable String sensorId) {
        sensorDTO.setId(sensorId);
        sensorDTO.setUnitId(unitId);
        SensorDTO updatedSensorDTO = sensorService.update(sensorDTO);
        if(updatedSensorDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(updatedSensorDTO, OK);
        }
    }

    @DeleteMapping("/farms/{farmId}/units/{unitId}/sensors/{sensorId}")
    public ResponseEntity<HttpStatus> delete(@PathVariable String farmId, @PathVariable String unitId, @PathVariable String sensorId) {
        SensorDTO deletedSensorDTO = sensorService.deleteById(sensorId);
        if(deletedSensorDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(NO_CONTENT);
        }
    }
}
