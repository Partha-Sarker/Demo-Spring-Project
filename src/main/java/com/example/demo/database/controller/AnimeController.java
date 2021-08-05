package com.example.demo.database.controller;

import com.example.demo.database.model.Anime;
import com.example.demo.database.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {
    @Autowired
    private AnimeRepository animeRepository;

    @GetMapping
    public List<Anime> getAnimeList() {
        return animeRepository.findAll();
    }


    @GetMapping("{id}")
    public Anime getAnime(@PathVariable Long id) {
        return animeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Anime saveAnime(@RequestBody Anime newAnime) {
        return animeRepository.save(newAnime);
    }

    @PutMapping
    public Anime updateAnime(@RequestBody Anime updatedAnime) {
        return animeRepository.save(updatedAnime);
    }

    @DeleteMapping("{id}")
    public void deleteAnime(@PathVariable Long id) {
        animeRepository.deleteById(id);
    }
}
