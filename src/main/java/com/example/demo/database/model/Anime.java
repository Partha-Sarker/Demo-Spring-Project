package com.example.demo.database.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    @Column(nullable = false)
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
    @JoinColumn(nullable = false)
    private List<Genre> genreList;
    @ManyToMany
    @JoinTable(name = "anime_studio")
    @JoinColumn(nullable = false)
    private List<Studio> studioList;
}
