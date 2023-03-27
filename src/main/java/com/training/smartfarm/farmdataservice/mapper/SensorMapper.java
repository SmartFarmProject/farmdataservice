package com.training.smartfarm.farmdataservice.mapper;

import com.training.smartfarm.farmdataservice.bo.SensorBO;
import com.training.smartfarm.farmdataservice.bo.UnitBO;
import com.training.smartfarm.farmdataservice.dto.SensorDTO;

public class SensorMapper {

    public SensorDTO sensorBOToSensorDTO(SensorBO sensorBO) {
        if (sensorBO == null) {
            return null;
        }
        return SensorDTO.builder()
                .id(sensorBO.getId())
                .physicalId(sensorBO.getPhysicalId())
                .dataSourceFieldName(sensorBO.getDataSourceFieldName())
                .sensorType(SensorDTO.SensorType.valueOf(sensorBO.getSensorType()))
                .unitId(sensorBO.getUnitId())
                .build();
    }

    public SensorBO sensorDTOToSensorBO(SensorDTO sensorDTO) {
        if (sensorDTO == null) {
            return null;
        }
        return SensorBO.builder()
                .id(sensorDTO.getId())
                .physicalId(sensorDTO.getPhysicalId())
                .dataSourceFieldName(sensorDTO.getDataSourceFieldName())
                .sensorType(sensorDTO.getSensorType().name())
                .unitId(sensorDTO.getUnitId())
                .build();
    }
}
