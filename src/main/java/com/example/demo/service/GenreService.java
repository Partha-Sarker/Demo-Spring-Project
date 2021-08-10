package com.example.demo.service;

import com.example.demo.database.model.Genre;
import com.example.demo.database.repository.GenreRepository;
import com.example.demo.helper.dto.GenreDTO;
import com.example.demo.helper.mapper.GenreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenreService {
    private GenreMapper mapper = GenreMapper.INSTANCE;
    @Autowired
    private GenreRepository genreRepository;

    public List<GenreDTO> getAll() {
        return genreRepository.findAll().stream().map(mapper::genreToGenreDTO).collect(Collectors.toList());
    }

    public GenreDTO getByID(Long id) {
        Genre genre = genreRepository.findById(id).orElse(null);
        GenreDTO genreDTO = mapper.genreToGenreDTO(genre);
        return genreDTO;
    }

    public GenreDTO createGenre(GenreDTO genreDTO) {
        Genre genre = mapper.genreDTOToGenre(genreDTO);
        genre = genreRepository.save(genre);
        genreDTO = mapper.genreToGenreDTO(genre);
        return genreDTO;
    }

    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }

    public GenreDTO updateGenre(GenreDTO genreDTO) {
        Genre genre = mapper.genreDTOToGenre(genreDTO);
        genre = genreRepository.save(genre);
        genreDTO = mapper.genreToGenreDTO(genre);
        return genreDTO;
    }
}
