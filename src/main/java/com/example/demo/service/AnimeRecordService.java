package com.example.demo.service;

import com.example.demo.database.model.AnimeRecord;
import com.example.demo.database.repository.AnimeRecordRepository;
import com.example.demo.helper.dto.AnimeRecordDTO;
import com.example.demo.helper.mapper.AnimeRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimeRecordService {
    private AnimeRecordMapper mapper = AnimeRecordMapper.INSTANCE;
    @Autowired
    private AnimeRecordRepository animeRecordRepository;

    public List<AnimeRecordDTO> getAll() {
        return animeRecordRepository.findAll().stream().map(mapper::animeRecordToAnimeRecordDTO).collect(Collectors.toList());
    }

    public AnimeRecordDTO getByID(Long id) {
        AnimeRecord animeRecord = animeRecordRepository.findById(id).orElse(null);
        AnimeRecordDTO animeRecordDTO = mapper.animeRecordToAnimeRecordDTO(animeRecord);
        return animeRecordDTO;
    }

    public AnimeRecordDTO createAnimeRecord(AnimeRecordDTO animeRecordDTO) {
        AnimeRecord animeRecord = mapper.animeRecordDTOToAnimeRecord(animeRecordDTO);
        animeRecord = animeRecordRepository.save(animeRecord);
        animeRecordDTO = mapper.animeRecordToAnimeRecordDTO(animeRecord);
        return animeRecordDTO;
    }

    public void deleteAnimeRecord(Long id) {
        animeRecordRepository.deleteById(id);
    }

    public AnimeRecordDTO updateAnimeRecord(AnimeRecordDTO animeRecordDTO) {
        AnimeRecord animeRecord = mapper.animeRecordDTOToAnimeRecord(animeRecordDTO);
        animeRecord = animeRecordRepository.save(animeRecord);
        animeRecordDTO = mapper.animeRecordToAnimeRecordDTO(animeRecord);
        return animeRecordDTO;
    }
}
