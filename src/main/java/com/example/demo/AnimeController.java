package com.example.demo;

import com.example.demo.database.Anime;
import com.example.demo.database.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AnimeController {
    @Autowired
    private AnimeRepository animeRepository;

    @CrossOrigin
    @GetMapping
    public List<Anime> getAnimeList() {
//        return new String[]{"Death note"};
        return animeRepository.findAll();
    }

    @CrossOrigin
    @PostMapping
    public Anime saveAnime(@RequestBody Anime newAnime) {
        return animeRepository.save(newAnime);
    }
}
