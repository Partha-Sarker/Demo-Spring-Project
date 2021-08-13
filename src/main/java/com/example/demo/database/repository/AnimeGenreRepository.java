package com.example.demo.database.repository;

import com.example.demo.database.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeGenreRepository extends JpaRepository<AnimeGenre, Long> {
    List<AnimeGenre> findAllByAnimeId(Long id);
    List<AnimeGenre> findAllByGenreId(Long id);
}
