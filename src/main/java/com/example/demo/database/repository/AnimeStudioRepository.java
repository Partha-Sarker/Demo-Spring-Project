package com.example.demo.database.repository;

import com.example.demo.database.model.Anime;
import com.example.demo.database.model.AnimeGenre;
import com.example.demo.database.model.AnimeStudio;
import com.example.demo.database.model.Studio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeStudioRepository extends JpaRepository<AnimeStudio, Long> {
    List<AnimeStudio> findAllByAnimeId(Long id);
    List<AnimeStudio> findAllByStudioId(Long id);
}
