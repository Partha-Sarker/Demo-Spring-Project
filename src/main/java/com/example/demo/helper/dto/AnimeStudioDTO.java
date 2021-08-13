package com.example.demo.helper.dto;

import com.example.demo.database.model.Anime;
import com.example.demo.database.model.Studio;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class AnimeStudioDTO {
    private Long id;
    private Anime anime;
    private Studio studio;
}
