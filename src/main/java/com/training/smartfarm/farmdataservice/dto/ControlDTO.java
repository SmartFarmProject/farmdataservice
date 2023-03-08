package com.training.smartfarm.farmdataservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ControlDTO {

    private String id;
    private String unitId;
    private String physicalId;
    private ControlType controlType;

    public enum ControlType {
        WATERING_SWITCH,
        AUTOMATIC_LIGHT_SWITCH
    }
}
