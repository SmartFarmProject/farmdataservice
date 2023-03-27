package com.training.smartfarm.farmdataservice.mapper;

import com.training.smartfarm.farmdataservice.bo.FarmBO;
import com.training.smartfarm.farmdataservice.bo.UnitBO;
import com.training.smartfarm.farmdataservice.dto.UnitDTO;

import java.util.stream.Collectors;

import static com.training.smartfarm.farmdataservice.mapper.MapperRegistry.SENSOR_MAPPER;
import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;

public class UnitMapper {

    public UnitDTO unitBOToUnitDTO(UnitBO unitBO) {
        if (unitBO == null) {
            return null;
        }
        return UnitDTO.builder()
                .id(unitBO.getId())
                .name(unitBO.getName())
                .farmId(unitBO.getFarm().getId())
//                .sensors(ofNullable(unitBO.getSensors()).orElse(emptyList()).stream().map(SENSOR_MAPPER::sensorBOToSensorDTO).collect(toList()))
                .build();
    }

    public UnitBO unitDTOToUnitBO(UnitDTO unitDTO) {
        if (unitDTO == null) {
            return null;
        }
        return UnitBO.builder()
                .id(unitDTO.getId())
                .name(unitDTO.getName())
                .farm(FarmBO.builder().id(unitDTO.getFarmId()).build())
                .build();
    }
}
