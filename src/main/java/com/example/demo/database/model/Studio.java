package com.example.demo.database.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Studio {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private Date foundedOn;
    @ManyToMany(mappedBy = "studioList")
    private List<Anime> animeList = new ArrayList<>();
}
