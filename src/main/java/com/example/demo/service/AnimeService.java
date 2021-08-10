package com.example.demo.service;

import com.example.demo.database.model.Anime;
import com.example.demo.database.repository.AnimeRepository;
import com.example.demo.helper.dto.AnimeDTO;
import com.example.demo.helper.mapper.AnimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimeService {
    private AnimeMapper mapper = AnimeMapper.INSTANCE;
    @Autowired
    private AnimeRepository animeRepository;

    public List<AnimeDTO> getAll() {
        return animeRepository.findAll().stream().map(mapper::animeToAnimeDTO).collect(Collectors.toList());
    }

    public AnimeDTO getByID(Long id) {
        Anime anime = animeRepository.findById(id).orElse(null);
        AnimeDTO animeDTO = mapper.animeToAnimeDTO(anime);
        return animeDTO;
    }

    public AnimeDTO createAnime(AnimeDTO animeDTO) {
        Anime anime = mapper.animeDTOToAnime(animeDTO);
        anime = animeRepository.save(anime);
        animeDTO = mapper.animeToAnimeDTO(anime);
        return animeDTO;
    }

    public void deleteAnime(Long id) {
        animeRepository.deleteById(id);
    }

    public AnimeDTO updateAnime(AnimeDTO animeDTO) {
        Anime anime = mapper.animeDTOToAnime(animeDTO);
        anime = animeRepository.save(anime);
        animeDTO = mapper.animeToAnimeDTO(anime);
        return animeDTO;
    }
}
