package com.training.smartfarm.farmdataservice.repository;

import com.training.smartfarm.farmdataservice.bo.SensorBO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SensorRepository extends JpaRepository<SensorBO, String> {

    List<SensorBO> findByUnitId(String unitId);

    List<SensorBO> findByPhysicalIdIn(List<String> physicalIds);

    SensorBO findByPhysicalId(String physicalId);
}
