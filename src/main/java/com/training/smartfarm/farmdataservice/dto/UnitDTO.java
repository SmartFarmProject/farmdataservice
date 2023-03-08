package com.training.smartfarm.farmdataservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UnitDTO {

    private String id;
    private String name;
    private String farmId;
    private List<SensorDTO> sensors;
    private List<ControlDTO> controllers;

}
