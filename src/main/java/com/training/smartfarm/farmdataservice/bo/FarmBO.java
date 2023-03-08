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
public class FarmBO {

    @Id
    @GeneratedValue(strategy = UUID)
    private String id;
    private String name;
    private String userId;

    @OneToMany(mappedBy = "farm", fetch = FetchType.EAGER)
    private List<UnitBO> units;
}
