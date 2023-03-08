package com.training.smartfarm.farmdataservice.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;
import static jakarta.persistence.GenerationType.UUID;

@Data
@Entity
public class ControlBO {

    @Id
    @GeneratedValue(strategy = UUID)
    private String id;
    private String controlType;
    private String physicalId;

    @ManyToOne
    private UnitBO unit;
}
