package com.example.demo.database.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Genre {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    @ManyToMany(mappedBy = "genreList")
    @JsonIgnoreProperties("genreList")
    private List<Anime> animeList;
}
