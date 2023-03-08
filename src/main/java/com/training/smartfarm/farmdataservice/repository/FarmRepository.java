package com.training.smartfarm.farmdataservice.repository;

import com.training.smartfarm.farmdataservice.bo.FarmBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmRepository extends JpaRepository<FarmBO, String> {
}
