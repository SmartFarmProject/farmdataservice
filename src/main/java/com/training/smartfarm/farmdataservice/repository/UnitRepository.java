package com.training.smartfarm.farmdataservice.repository;

import com.training.smartfarm.farmdataservice.bo.UnitBO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnitRepository extends JpaRepository<UnitBO, String> {
    List<UnitBO> findByFarmId(String farmId);
}
