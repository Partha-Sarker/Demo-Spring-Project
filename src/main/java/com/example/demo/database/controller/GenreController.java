package com.example.demo.database.controller;

import com.example.demo.database.model.Genre;
import com.example.demo.database.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("genre")
public class GenreController {
    @Autowired
    private GenreRepository genreRepository;

    @GetMapping
    public List<Genre> getGenreList() {
        return genreRepository.findAll();
    }


    @GetMapping("{id}")
    public Genre getGenre(@PathVariable Long id) {
        return genreRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Genre saveGenre(@RequestBody Genre newGenre) {
        return genreRepository.save(newGenre);
    }

    @PutMapping
    public Genre updateGenre(@RequestBody Genre updatedGenre) {
        return genreRepository.save(updatedGenre);
    }

    @DeleteMapping("{id}")
    public void deleteGenre(@PathVariable Long id) {
        genreRepository.deleteById(id);
    }
}
