package com.example.demo.controller;

import com.example.demo.helper.dto.AnimeStudioDTO;
import com.example.demo.service.AnimeStudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("anime-studio")
public class AnimeStudioController {
    @Autowired
    private AnimeStudioService animeStudioService;

    @GetMapping
    public List<AnimeStudioDTO> getAnimeStudioList() {
        return animeStudioService.getAll();
    }

    @PostMapping
    public AnimeStudioDTO saveAnimeStudio(@RequestBody AnimeStudioDTO newAnimeStudioDTO) {
        return animeStudioService.createAnimeStudio(newAnimeStudioDTO);
    }

    @PutMapping
    public AnimeStudioDTO updateAnimeStudio(@RequestBody AnimeStudioDTO updatedAnimeStudioDTO) {
        return animeStudioService.createAnimeStudio(updatedAnimeStudioDTO);
    }

    @DeleteMapping("{id}")
    public void deleteAnimeStudio(@PathVariable Long id) {
        animeStudioService.deleteAnimeStudio(id);
    }
}
