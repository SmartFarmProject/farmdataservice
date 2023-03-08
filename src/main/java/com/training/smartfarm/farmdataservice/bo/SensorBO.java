package com.training.smartfarm.farmdataservice.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;
import static jakarta.persistence.GenerationType.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SensorBO {


    @Id
    @GeneratedValue(strategy = UUID)
    private String id;
    private String physicalId;
    private String sensorType;
    private String dataSourceFieldName;

    @ManyToOne
    private UnitBO unit;
}
