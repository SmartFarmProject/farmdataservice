package com.training.smartfarm.farmdataservice.controller;

import com.training.smartfarm.farmdataservice.dto.FarmDTO;
import com.training.smartfarm.farmdataservice.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
public class FarmController {

    @Autowired
    private FarmService farmService;

    @GetMapping("/farms")
    public List<FarmDTO> findAll() {
        return farmService.findAll();
    }

    @GetMapping("/farms/{id}")
    public ResponseEntity<FarmDTO> getById(@PathVariable String id) {
        FarmDTO farmDTO = farmService.findById(id);

        if(farmDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(farmDTO, OK);
        }
    }

    @PostMapping("/farms")
    public ResponseEntity<FarmDTO> create(@RequestBody FarmDTO farmDTO) {

        return new ResponseEntity<>(farmService.create(farmDTO), CREATED);
    }

    @PutMapping("/farms/{id}")
    public ResponseEntity<FarmDTO> update(@RequestBody FarmDTO farmDTO, @PathVariable String id) {
        farmDTO.setId(id);
        FarmDTO updatedFarmDTO = farmService.update(farmDTO);
        if(updatedFarmDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(farmDTO, OK);
        }
    }

    @DeleteMapping("/farms/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable String id) {
        FarmDTO deletedFarmDTO = farmService.deleteById(id);
        if(deletedFarmDTO == null) {
            return new ResponseEntity<>(NOT_FOUND);
        } else {
            return new ResponseEntity<>(NO_CONTENT);
        }
    }
}
