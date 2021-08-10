package com.example.demo.controller;

import com.example.demo.helper.dto.AnimeRecordDTO;
import com.example.demo.service.AnimeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("anime-record")
public class AnimeRecordController {
    @Autowired
    private AnimeRecordService animeRecordService;

    @GetMapping
    public List<AnimeRecordDTO> getAnimeRecordList() {
        return animeRecordService.getAll();
    }
    
    @GetMapping("{id}")
    public AnimeRecordDTO getAnimeRecord(@PathVariable Long id) {
        return animeRecordService.getByID(id);
    }

    @PostMapping
    public AnimeRecordDTO saveAnimeRecord(@RequestBody AnimeRecordDTO newAnimeRecordDTO) {
        return animeRecordService.createAnimeRecord(newAnimeRecordDTO);
    }

    @PutMapping
    public AnimeRecordDTO updateAnimeRecord(@RequestBody AnimeRecordDTO updatedAnimeRecordDTO) {
        return animeRecordService.createAnimeRecord(updatedAnimeRecordDTO);
    }

    @DeleteMapping("{id}")
    public void deleteAnimeRecord(@PathVariable Long id) {
        animeRecordService.deleteAnimeRecord(id);
    }
}
