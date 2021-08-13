package com.example.demo.database.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(nullable = false)
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
