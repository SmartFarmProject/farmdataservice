package com.training.smartfarm.farmdataservice.service;

import com.training.smartfarm.farmdataservice.bo.FarmBO;
import com.training.smartfarm.farmdataservice.bo.UnitBO;
import com.training.smartfarm.farmdataservice.dto.UnitDTO;
import com.training.smartfarm.farmdataservice.repository.FarmRepository;
import com.training.smartfarm.farmdataservice.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static com.training.smartfarm.farmdataservice.mapper.MapperRegistry.UNIT_MAPPER;

@Service
public class UnitService {

    @Autowired
    private UnitRepository unitRepository;
    @Autowired
    private FarmRepository farmRepository;

    @Transactional(readOnly = true)
    public UnitDTO findById(String id) {
        return UNIT_MAPPER.unitBOToUnitDTO(unitRepository.findById(id).orElse(null));
    }

    @Transactional(readOnly = true)
    public List<UnitDTO> findByFarmId(String farmId) {
        return unitRepository.findByFarmId(farmId).stream().map(UNIT_MAPPER::unitBOToUnitDTO).collect(Collectors.toList());
    }

    @Transactional
    public UnitDTO create(UnitDTO unitDTO) {
        FarmBO farmBO = farmRepository.findById(unitDTO.getFarmId()).orElse(null);
        if(farmBO == null) {
            return null;
        }

        UnitBO unitBO = UNIT_MAPPER.unitDTOToUnitBO(unitDTO);
        unitBO.setFarm(farmBO);
        return UNIT_MAPPER.unitBOToUnitDTO(unitRepository.save(unitBO));
    }

    @Transactional
    public UnitDTO update(UnitDTO unitDTO) {
        FarmBO farmBO = farmRepository.findById(unitDTO.getFarmId()).orElse(null);
        UnitBO unitBO = unitRepository.findById(unitDTO.getId()).orElse(null);
        if(farmBO == null || unitBO == null) {
            return null;
        }

        UnitBO newUnitBO = UNIT_MAPPER.unitDTOToUnitBO(unitDTO);
        return UNIT_MAPPER.unitBOToUnitDTO(unitRepository.save(newUnitBO));
    }

    @Transactional
    public UnitDTO deleteById(String id) {
        UnitBO unitBO = unitRepository.findById(id).orElse(null);

        if(unitBO == null) {
            return null;
        }

        unitRepository.deleteById(id);
        return UNIT_MAPPER.unitBOToUnitDTO(unitBO);
    }
}
