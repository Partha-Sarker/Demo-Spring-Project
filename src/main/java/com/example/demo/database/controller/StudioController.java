package com.example.demo.database.controller;

import com.example.demo.database.model.Studio;
import com.example.demo.database.repository.StudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("studio")
public class StudioController {
    @Autowired
    private StudioRepository studioRepository;

    @GetMapping
    public List<Studio> getStudioList() {
        return studioRepository.findAll();
    }


    @GetMapping("{id}")
    public Studio getStudio(@PathVariable Long id) {
        return studioRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Studio saveStudio(@RequestBody Studio newStudio) {
        return studioRepository.save(newStudio);
    }

    @PutMapping
    public Studio updateStudio(@RequestBody Studio updatedStudio) {
        return studioRepository.save(updatedStudio);
    }

    @DeleteMapping("{id}")
    public void deleteStudio(@PathVariable Long id) {
        studioRepository.deleteById(id);
    }
}
