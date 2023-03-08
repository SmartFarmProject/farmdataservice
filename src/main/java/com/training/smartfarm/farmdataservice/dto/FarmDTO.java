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
public class FarmDTO {

    private String id;
    private String name;
    private String userId;

    private List<UnitDTO> units;
}
