package com.example.demo.database.controller;

import com.example.demo.database.model.AnimeRecord;
import com.example.demo.database.repository.AnimeRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("anime-record")
public class AnimeRecordController {
    @Autowired
    private AnimeRecordRepository animeRecordRepository;

    @GetMapping
    public List<AnimeRecord> getAnimeRecordList() {
        return animeRecordRepository.findAll();
    }


    @GetMapping("{id}")
    public AnimeRecord getAnimeRecord(@PathVariable Long id) {
        return animeRecordRepository.findById(id).orElse(null);
    }

    @PostMapping
    public AnimeRecord saveAnimeRecord(@RequestBody AnimeRecord newAnimeRecord) {
        return animeRecordRepository.save(newAnimeRecord);
    }

    @PutMapping
    public AnimeRecord updateAnimeRecord(@RequestBody AnimeRecord updatedAnimeRecord) {
        return animeRecordRepository.save(updatedAnimeRecord);
    }

    @DeleteMapping("{id}")
    public void deleteAnimeRecord(@PathVariable Long id) {
        animeRecordRepository.deleteById(id);
    }
}
