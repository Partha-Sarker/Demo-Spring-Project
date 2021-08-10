package com.example.demo.service;

import com.example.demo.database.model.Studio;
import com.example.demo.database.repository.StudioRepository;
import com.example.demo.helper.dto.StudioDTO;
import com.example.demo.helper.mapper.StudioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudioService {
    private StudioMapper mapper = StudioMapper.INSTANCE;
    @Autowired
    private StudioRepository studioRepository;

    public List<StudioDTO> getAll() {
        return studioRepository.findAll().stream().map(mapper::studioToStudioDTO).collect(Collectors.toList());
    }

    public StudioDTO getByID(Long id) {
        Studio studio = studioRepository.findById(id).orElse(null);
        StudioDTO studioDTO = mapper.studioToStudioDTO(studio);
        return studioDTO;
    }

    public StudioDTO createStudio(StudioDTO studioDTO) {
        Studio studio = mapper.studioDTOToStudio(studioDTO);
        studio = studioRepository.save(studio);
        studioDTO = mapper.studioToStudioDTO(studio);
        return studioDTO;
    }

    public void deleteStudio(Long id) {
        studioRepository.deleteById(id);
    }

    public StudioDTO updateStudio(StudioDTO studioDTO) {
        Studio studio = mapper.studioDTOToStudio(studioDTO);
        studio = studioRepository.save(studio);
        studioDTO = mapper.studioToStudioDTO(studio);
        return studioDTO;
    }
}
