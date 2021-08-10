package com.example.demo.helper.dto;

import com.example.demo.database.model.Anime;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class AnimeRecordDTO {
    private Long id;
    private Anime anime;
    private String status;
    private Float rating;
    private Integer watchedEpisodes;
    private Date watchStartDate;
    private Date watchEndDate;
    private String review;
}
