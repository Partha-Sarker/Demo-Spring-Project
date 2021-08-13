package com.example.demo.service;

import com.example.demo.database.model.AnimeStudio;
import com.example.demo.database.model.Studio;
import com.example.demo.database.repository.AnimeStudioRepository;
import com.example.demo.helper.dto.AnimeDTO;
import com.example.demo.helper.dto.AnimeStudioDTO;
import com.example.demo.helper.dto.StudioDTO;
import com.example.demo.helper.mapper.AnimeMapper;
import com.example.demo.helper.mapper.AnimeStudioMapper;
import com.example.demo.helper.mapper.StudioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimeStudioService {
    private final AnimeStudioMapper mapper = AnimeStudioMapper.INSTANCE;
    private final AnimeMapper animeMapper = AnimeMapper.INSTANCE;
    private final StudioMapper studioMapper = StudioMapper.INSTANCE;
    @Autowired
    private AnimeStudioRepository animeStudioRepository;

    public List<AnimeStudioDTO> getAll() {
        return animeStudioRepository.findAll().stream().map(mapper::animeStudioToAnimeStudioDTO).collect(Collectors.toList());
    }

    public List<AnimeDTO> getAllAnime(Long studioId) {
        return animeStudioRepository.findAllByStudioId(studioId).stream()
                .map(animeStudio -> animeMapper.animeToAnimeDTO(animeStudio.getAnime()))
                .collect(Collectors.toList());
    }

    public List<StudioDTO> getAllStudio(Long animeId) {
        return animeStudioRepository.findAllByAnimeId(animeId).stream()
                .map(animeStudio -> studioMapper.studioToStudioDTO(animeStudio.getStudio()))
                .collect(Collectors.toList());
    }

    public AnimeStudioDTO createAnimeStudio(AnimeStudioDTO animeStudioDTO) {
        AnimeStudio animeStudio = mapper.animeStudioDTOToAnimeStudio(animeStudioDTO);
        animeStudio = animeStudioRepository.save(animeStudio);
        animeStudioDTO = mapper.animeStudioToAnimeStudioDTO(animeStudio);
        return animeStudioDTO;
    }

    public void deleteAnimeStudio(Long id) {
        animeStudioRepository.deleteById(id);
    }

    public AnimeStudioDTO updateAnimeStudio(AnimeStudioDTO animeStudioDTO) {
        AnimeStudio animeStudio = mapper.animeStudioDTOToAnimeStudio(animeStudioDTO);
        animeStudio = animeStudioRepository.save(animeStudio);
        animeStudioDTO = mapper.animeStudioToAnimeStudioDTO(animeStudio);
        return animeStudioDTO;
    }
}
