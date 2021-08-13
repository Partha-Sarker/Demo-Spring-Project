package com.example.demo.helper.dto;

import com.example.demo.database.model.Anime;
import com.example.demo.database.model.Genre;
import com.example.demo.database.model.Studio;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimeGenreDTO {
    private Long id;
    private Anime anime;
    private Genre genre;
}
