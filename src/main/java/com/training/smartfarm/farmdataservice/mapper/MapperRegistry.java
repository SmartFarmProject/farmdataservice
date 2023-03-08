package com.training.smartfarm.farmdataservice.mapper;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MapperRegistry {

    public static final FarmMapper FARM_MAPPER = new FarmMapper();
    public static final UnitMapper UNIT_MAPPER = new UnitMapper();
    public static final SensorMapper SENSOR_MAPPER = new SensorMapper();

}
