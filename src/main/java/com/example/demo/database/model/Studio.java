package com.example.demo.database.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Studio {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    private Date foundedOn;
    @ManyToMany(mappedBy = "studioList")
    @JsonIgnoreProperties("studioList")
    private List<Anime> animeList;
}
