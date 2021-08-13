package com.example.demo.helper.dto;

import com.example.demo.database.model.Genre;
import com.example.demo.database.model.Studio;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class AnimeDTO {
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
}
