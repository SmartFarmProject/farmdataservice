package com.training.smartfarm.farmdataservice.bo;

import jakarta.persistence.*;
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
    @Column(unique = true)
    private String physicalId;
    private String sensorType;
    private String dataSourceFieldName;

    @Column(name = "unit_id")
    private String unitId;
//
//    @ManyToOne
//    private UnitBO unit;
}
