package com.example.demo.helper.mapper;

import com.example.demo.database.model.Anime;
import com.example.demo.database.model.AnimeRecord;
import com.example.demo.database.repository.AnimeRepository;
import com.example.demo.helper.dto.AnimeDTO;
import com.example.demo.helper.dto.AnimeRecordDTO;
import com.example.demo.helper.validators.annotation.ValidAnimeId;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface AnimeRecordMapper {
    AnimeRecordMapper INSTANCE = Mappers.getMapper(AnimeRecordMapper.class);

    @Mapping(source = "anime.id", target = "animeId")
    AnimeRecordDTO animeRecordToAnimeRecordDTO(AnimeRecord animeRecord);
    @InheritInverseConfiguration
    AnimeRecord animeRecordDTOToAnimeRecord(AnimeRecordDTO animeRecordDTO);
}
