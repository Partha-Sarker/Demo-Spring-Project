package com.example.demo.database.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@Data
@Entity
@NoArgsConstructor
public class AnimeRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
//    @JoinColumn(nullable = false)
    private Anime anime;
    private String status;
    private Float rating;
    private Integer watchedEpisodes;
    private Date watchStartDate;
    private Date watchEndDate;
    private String review;
}
