package com.training.smartfarm.farmdataservice.event;

import com.training.smartfarm.farmdataservice.dto.SensorDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SensorEvent implements Serializable {

    public static final String CREATED_EVENT_TYPE = "CREATED";
    public static final String UPDATED_EVENT_TYPE = "UPDATED";
    public static final String DELETED_EVENT_TYPE = "DELETED";

    private String eventType;

    private SensorDTO sensorDTO;
}
