package com.example.demo.controller;

import com.example.demo.helper.dto.AnimeDTO;
import com.example.demo.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @GetMapping
    public List<AnimeDTO> getAnimeList() {
        return animeService.getAll();
    }


    @GetMapping("{id}")
    public AnimeDTO getAnime(@PathVariable Long id) {
        return animeService.getByID(id);
    }

    @PostMapping
    public AnimeDTO saveAnime(@RequestBody AnimeDTO newAnimeDTO) {
        return animeService.createAnime(newAnimeDTO);
    }

    @PutMapping
    public AnimeDTO updateAnime(@RequestBody AnimeDTO updatedAnimeDTO) {
        return animeService.updateAnime(updatedAnimeDTO);
    }

    @DeleteMapping("{id}")
    public void deleteAnime(@PathVariable Long id) {
        animeService.deleteAnime(id);
    }
}
