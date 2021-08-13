package com.example.demo.controller;

import com.example.demo.helper.dto.AnimeGenreDTO;
import com.example.demo.service.AnimeGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("anime-genre")
public class AnimeGenreController {
    @Autowired
    private AnimeGenreService animeGenreService;

    @GetMapping
    public List<AnimeGenreDTO> getAnimeGenreList() {
        return animeGenreService.getAll();
    }

    @PostMapping
    public AnimeGenreDTO saveAnimeGenre(@RequestBody AnimeGenreDTO newAnimeGenreDTO) {
        return animeGenreService.createAnimeGenre(newAnimeGenreDTO);
    }

    @PutMapping
    public AnimeGenreDTO updateAnimeGenre(@RequestBody AnimeGenreDTO updatedAnimeGenreDTO) {
        return animeGenreService.createAnimeGenre(updatedAnimeGenreDTO);
    }

    @DeleteMapping("{id}")
    public void deleteAnimeGenre(@PathVariable Long id) {
        animeGenreService.deleteAnimeGenre(id);
    }
}
