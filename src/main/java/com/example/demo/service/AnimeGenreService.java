package com.example.demo.service;

import com.example.demo.database.model.AnimeGenre;
import com.example.demo.database.repository.AnimeGenreRepository;
import com.example.demo.helper.dto.AnimeDTO;
import com.example.demo.helper.dto.AnimeGenreDTO;
import com.example.demo.helper.dto.GenreDTO;
import com.example.demo.helper.mapper.AnimeMapper;
import com.example.demo.helper.mapper.AnimeGenreMapper;
import com.example.demo.helper.mapper.GenreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimeGenreService {
    private final AnimeGenreMapper mapper = AnimeGenreMapper.INSTANCE;
    private final AnimeMapper animeMapper = AnimeMapper.INSTANCE;
    private final GenreMapper genreMapper = GenreMapper.INSTANCE;
    @Autowired
    private AnimeGenreRepository animeGenreRepository;

    public List<AnimeGenreDTO> getAll() {
        return animeGenreRepository.findAll().stream().map(mapper::animeGenreToAnimeGenreDTO).collect(Collectors.toList());
    }

    public List<AnimeDTO> getAllAnime(Long genreId) {
        return animeGenreRepository.findAllByGenreId(genreId).stream()
                .map(animeGenre -> animeMapper.animeToAnimeDTO(animeGenre.getAnime()))
                .collect(Collectors.toList());
    }

    public List<GenreDTO> getAllGenre(Long animeId) {
        return animeGenreRepository.findAllByAnimeId(animeId).stream()
                .map(animeGenre -> genreMapper.genreToGenreDTO(animeGenre.getGenre()))
                .collect(Collectors.toList());
    }

    public AnimeGenreDTO createAnimeGenre(AnimeGenreDTO animeGenreDTO) {
        AnimeGenre animeGenre = mapper.animeGenreDTOToAnimeGenre(animeGenreDTO);
        animeGenre = animeGenreRepository.save(animeGenre);
        animeGenreDTO = mapper.animeGenreToAnimeGenreDTO(animeGenre);
        return animeGenreDTO;
    }

    public void deleteAnimeGenre(Long id) {
        animeGenreRepository.deleteById(id);
    }

    public AnimeGenreDTO updateAnimeGenre(AnimeGenreDTO animeGenreDTO) {
        AnimeGenre animeGenre = mapper.animeGenreDTOToAnimeGenre(animeGenreDTO);
        animeGenre = animeGenreRepository.save(animeGenre);
        animeGenreDTO = mapper.animeGenreToAnimeGenreDTO(animeGenre);
        return animeGenreDTO;
    }
}
