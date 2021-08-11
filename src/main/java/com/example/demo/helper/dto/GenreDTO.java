package com.example.demo.helper.dto;

import com.example.demo.database.model.Anime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.ManyToMany;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class GenreDTO {
    private Long id;
    private String name;
    private String description;
    @JsonIgnoreProperties("genreList")
    private List<Anime> animeList;

    @Override
    public String toString() {
        return name;
    }
}
