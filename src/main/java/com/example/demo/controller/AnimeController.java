package com.example.demo.controller;

import com.example.demo.helper.dto.AnimeDTO;
import com.example.demo.service.AnimeGenreService;
import com.example.demo.service.AnimeService;
import com.example.demo.service.AnimeStudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {
    @Autowired
    private AnimeService animeService;
    @Autowired
    private AnimeStudioService animeStudioService;
    @Autowired
    private AnimeGenreService animeGenreService;

    @GetMapping
    public List<AnimeDTO> getAnimeList() {
        return animeService.getAll();
    }

    @GetMapping("studio/{studioId}")
    public List<AnimeDTO> getAnimeListByStudio(@PathVariable Long studioId) {
        return animeStudioService.getAllAnime(studioId);
    }

    @GetMapping("genre/{genreId}")
    public List<AnimeDTO> getAnimeListByGenre(@PathVariable Long genreId) {
        return animeGenreService.getAllAnime(genreId);
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
