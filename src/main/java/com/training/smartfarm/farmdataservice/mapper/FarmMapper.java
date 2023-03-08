package com.training.smartfarm.farmdataservice.mapper;

import com.training.smartfarm.farmdataservice.bo.FarmBO;
import com.training.smartfarm.farmdataservice.dto.FarmDTO;

import java.util.stream.Collectors;

import static com.training.smartfarm.farmdataservice.mapper.MapperRegistry.UNIT_MAPPER;
import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;

public class FarmMapper {

    public FarmDTO farmBOToFarmDTO(FarmBO farmBO) {
        if (farmBO == null) {
            return null;
        }
        return FarmDTO.builder()
                .id(farmBO.getId())
                .name(farmBO.getName())
                .userId(farmBO.getUserId())
                .units(ofNullable(farmBO.getUnits()).orElse(emptyList()).stream().map(UNIT_MAPPER::unitBOToUnitDTO).collect(Collectors.toList()))
                .build();
    }

    public FarmBO farmDTOToFarmBO(FarmDTO farmDTO) {
        if (farmDTO == null) {
            return null;
        }
        return FarmBO.builder()
                .id(farmDTO.getId())
                .name(farmDTO.getName())
                .userId(farmDTO.getUserId())
                .build();
    }
}
