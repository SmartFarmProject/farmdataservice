package com.training.smartfarm.farmdataservice.service;

import com.training.smartfarm.farmdataservice.bo.FarmBO;
import com.training.smartfarm.farmdataservice.dto.FarmDTO;
import com.training.smartfarm.farmdataservice.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.training.smartfarm.farmdataservice.mapper.MapperRegistry.FARM_MAPPER;
import static java.util.stream.Collectors.toList;

@Service
public class FarmService {

    @Autowired
    private FarmRepository farmRepository;

    @Transactional(readOnly = true)
    public List<FarmDTO> findAll() {
        return farmRepository.findAll().stream().map(FARM_MAPPER::farmBOToFarmDTO).collect(toList());
    }

    @Transactional(readOnly = true)
    public FarmDTO findById(String id) {
        return FARM_MAPPER.farmBOToFarmDTO(farmRepository.findById(id).orElse(null));
    }

    @Transactional
    public FarmDTO create(FarmDTO farmDTO) {
        FarmBO farmBO = FARM_MAPPER.farmDTOToFarmBO(farmDTO);

        FarmBO newFarmBO = farmRepository.save(farmBO);
        return FARM_MAPPER.farmBOToFarmDTO(newFarmBO);
    }

    @Transactional
    public FarmDTO update(FarmDTO farmDTO) {
        FarmBO existingFarmBO = farmRepository.findById(farmDTO.getId()).orElse(null);

        if(existingFarmBO == null) {
            return null;
        }

        FarmBO newFarmBO = farmRepository.save(FARM_MAPPER.farmDTOToFarmBO(farmDTO));
        return FARM_MAPPER.farmBOToFarmDTO(newFarmBO);
    }

    @Transactional
    public FarmDTO deleteById(String id) {
        FarmBO existingFarmBO = farmRepository.findById(id).orElse(null);

        if(existingFarmBO == null) {
            return null;
        }

        farmRepository.delete(existingFarmBO);
        return FARM_MAPPER.farmBOToFarmDTO(existingFarmBO);
    }
}
