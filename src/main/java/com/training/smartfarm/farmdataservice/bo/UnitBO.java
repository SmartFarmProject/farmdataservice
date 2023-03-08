package com.training.smartfarm.farmdataservice.bo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UnitBO {

    @Id
    @GeneratedValue(strategy = UUID)
    private String id;
    private String name;

    @ManyToOne
    private FarmBO farm;

    @OneToMany(mappedBy = "unit", fetch = FetchType.EAGER)
    private List<SensorBO> sensors;

    @OneToMany(mappedBy = "unit")
    private List<ControlBO> controls;
}