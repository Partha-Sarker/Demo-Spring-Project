package com.example.demo.helper.mapper;

import com.example.demo.database.model.Anime;
import com.example.demo.database.model.AnimeRecord;
import com.example.demo.helper.dto.AnimeDTO;
import com.example.demo.helper.dto.AnimeRecordDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimeRecordMapper {
    AnimeRecordMapper INSTANCE = Mappers.getMapper(AnimeRecordMapper.class);

    AnimeRecordDTO animeRecordToAnimeRecordDTO(AnimeRecord animeRecord);
    AnimeRecord animeRecordDTOToAnimeRecord(AnimeRecordDTO animeRecordDTO);
}
