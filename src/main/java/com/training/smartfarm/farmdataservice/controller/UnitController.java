package com.training.smartfarm.farmdataservice.controller;

import com.training.smartfarm.farmdataservice.dto.FarmDTO;
import com.training.smartfarm.farmdataservice.dto.UnitDTO;
import com.training.smartfarm.farmdataservice.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
public class UnitController {

    @Autowired
    private UnitService unitService;

    @GetMapping("/farms/{farmId}/units/{unitId}")
    public ResponseEntity<UnitDTO> getById(@PathVariable String farmId, @PathVariable String unitId) {
        UnitDTO unitDTO = unitService.findById(unitId);
        if(unitDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(unitDTO, OK);
        }
    }

    @GetMapping("/farms/{farmId}/units")
    public List<UnitDTO> findByFarmId(@PathVariable String farmId) {
         return unitService.findByFarmId(farmId);
    }

    @PostMapping("/farms/{farmId}/units")
    public ResponseEntity<UnitDTO> create(@RequestBody UnitDTO unitDTO, @PathVariable String farmId) {
        unitDTO.setFarmId(farmId);
        UnitDTO newUnitDTO = unitService.create(unitDTO);
        if(newUnitDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(newUnitDTO, CREATED);
        }
    }

    @PutMapping("/farms/{farmId}/units/{unitId}")
    public ResponseEntity<UnitDTO> update(@RequestBody UnitDTO unitDTO, @PathVariable String farmId, @PathVariable String unitId) {
        unitDTO.setId(unitId);
        unitDTO.setFarmId(farmId);
        UnitDTO updatedUnitDTO = unitService.update(unitDTO);
        if(updatedUnitDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(updatedUnitDTO, OK);
        }
    }

    @DeleteMapping("/farms/{farmId}/units/{unitId}")
    public ResponseEntity<HttpStatus> delete(@PathVariable String farmId, @PathVariable String unitId) {
        UnitDTO deletedFarmDTO = unitService.deleteById(unitId);
        if(deletedFarmDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(NO_CONTENT);
        }
    }
}
