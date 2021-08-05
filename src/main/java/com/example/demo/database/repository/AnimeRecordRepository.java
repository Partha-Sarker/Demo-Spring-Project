package com.example.demo.database.repository;

import com.example.demo.database.model.Anime;
import com.example.demo.database.model.AnimeRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRecordRepository extends JpaRepository<AnimeRecord, Long> {
}
