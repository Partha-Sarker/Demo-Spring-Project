package com.example.demo.controller;

import com.example.demo.database.model.Genre;
import com.example.demo.database.repository.GenreRepository;
import com.example.demo.helper.dto.GenreDTO;
import com.example.demo.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("genre")
public class GenreController {
    @Autowired
    private GenreService genreService;

    @GetMapping
    public List<GenreDTO> getGenreList() {
        return genreService.getAll();
    }


    @GetMapping("{id}")
    public GenreDTO getGenre(@PathVariable Long id) {
        return genreService.getByID(id);
    }

    @PostMapping
    public GenreDTO saveGenre(@RequestBody GenreDTO newGenreDTO) {
        return genreService.createGenre(newGenreDTO);
    }

    @PutMapping
    public GenreDTO updateGenre(@RequestBody GenreDTO updatedGenreDTO) {
        return genreService.updateGenre(updatedGenreDTO);
    }

    @DeleteMapping("{id}")
    public void deleteGenre(@PathVariable Long id) {
        genreService.deleteGenre(id);
    }
}
