package com.training.smartfarm.farmdataservice.controller;

import com.training.smartfarm.farmdataservice.dto.SensorDTO;
import com.training.smartfarm.farmdataservice.service.SensorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@Slf4j
@RestController
public class SensorController {

    @Autowired
    private SensorService sensorService;


    @GetMapping(value = "/sensors", params = "unitId")
    public List<SensorDTO> findByUnitId(@RequestParam String unitId) {
        return sensorService.findByUnitId(unitId);
    }


    @GetMapping("/sensors/{sensorId}")
    public ResponseEntity<SensorDTO> getById(@PathVariable String farmId, @PathVariable String unitId, @PathVariable String sensorId) {
        SensorDTO sensorDTO = sensorService.findById(sensorId);
        if(sensorDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(sensorDTO, OK);
        }
    }

    @GetMapping("/sensors")
    public List<SensorDTO> findAll() {
        log.info("Performing load of all sensors");
        return sensorService.findAll();
    }

    @GetMapping(value = "/sensors", params = "physicalId")
    public ResponseEntity<SensorDTO> findByPhysicalId(@RequestParam String physicalId){
        log.info("Performing find by physical id : {}", physicalId);
        SensorDTO sensorDTO = sensorService.findByPhysicalId(physicalId);
        if(sensorDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(sensorDTO, OK);
        }
    }


    @PostMapping("/sensors")
    public ResponseEntity<SensorDTO> create(@RequestBody SensorDTO sensorDTO, @PathVariable String farmId, @PathVariable String unitId) {
        sensorDTO.setUnitId(unitId);
        SensorDTO newSensorDTO = sensorService.create(sensorDTO);
        if(newSensorDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(newSensorDTO, CREATED);
        }
    }

    @PutMapping("/sensors/{sensorId}")
    public ResponseEntity<SensorDTO> update(@RequestBody SensorDTO sensorDTO, @PathVariable String sensorId) {
        sensorDTO.setId(sensorId);
        SensorDTO updatedSensorDTO = sensorService.update(sensorDTO);
        if(updatedSensorDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(updatedSensorDTO, OK);
        }
    }

    @DeleteMapping("/sensors/{sensorId}")
    public ResponseEntity<HttpStatus> delete(@PathVariable String sensorId) {
        SensorDTO deletedSensorDTO = sensorService.deleteById(sensorId);
        if(deletedSensorDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(NO_CONTENT);
        }
    }
}
