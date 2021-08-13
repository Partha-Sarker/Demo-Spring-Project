package com.example.demo.controller;

import com.example.demo.database.model.Studio;
import com.example.demo.database.repository.StudioRepository;
import com.example.demo.helper.dto.GenreDTO;
import com.example.demo.helper.dto.StudioDTO;
import com.example.demo.service.AnimeGenreService;
import com.example.demo.service.AnimeStudioService;
import com.example.demo.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("studio")
public class StudioController {
    @Autowired
    private StudioService studioService;
    @Autowired
    private AnimeStudioService animeStudioService;

    @GetMapping
    public List<StudioDTO> getStudioList() {
        return studioService.getAll();
    }

    @GetMapping("anime/{animeId}")
    public List<StudioDTO> getStudioListByAnime(@PathVariable Long animeId) {
        return animeStudioService.getAllStudio(animeId);
    }

    @GetMapping("{id}")
    public StudioDTO getStudio(@PathVariable Long id) {
        return studioService.getByID(id);
    }

    @PostMapping
    public StudioDTO saveStudio(@RequestBody StudioDTO newStudioDTO) {
        return studioService.createStudio(newStudioDTO);
    }

    @PutMapping
    public StudioDTO updateStudio(@RequestBody StudioDTO updatedStudioDTO) {
        return studioService.updateStudio(updatedStudioDTO);
    }

    @DeleteMapping("{id}")
    public void deleteStudio(@PathVariable Long id) {
        studioService.deleteStudio(id);
    }
}
