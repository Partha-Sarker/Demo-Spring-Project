package com.example.demo.database.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Anime {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String coverImage;
    private String type;
    private Integer episodes;
    private Integer duration;
    private String status;
    private String source;
    private Date airStartDate;
    private Date airEndDate;
    @ManyToMany
    @JoinTable(name = "anime_genre")
    private List<Genre> genreList = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "anime_studio")
    private List<Studio> studioList = new ArrayList<>();
}
