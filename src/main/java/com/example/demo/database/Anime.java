package com.example.demo.database;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Data
@Entity
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

    public Anime() {
    }

    public Anime(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Anime))
            return false;
        Anime employee = (Anime) o;
        return Objects.equals(this.id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
        return "Anime{" + "id=" + this.id + ", name='" + this.name + '}';
    }
}
