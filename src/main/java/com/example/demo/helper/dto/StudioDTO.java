package com.example.demo.helper.dto;

import com.example.demo.database.model.Anime;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.ManyToMany;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class StudioDTO {
    private Long id;
    private String name;
    private String description;
    private Date foundedOn;
    private List<Long> animeListId;
}
