package com.example.demo.helper.mapper;

import com.example.demo.database.model.AnimeStudio;
import com.example.demo.helper.dto.AnimeStudioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimeStudioMapper {
    AnimeStudioMapper INSTANCE = Mappers.getMapper(AnimeStudioMapper.class);

    AnimeStudioDTO animeStudioToAnimeStudioDTO(AnimeStudio animeStudio);
    AnimeStudio animeStudioDTOToAnimeStudio(AnimeStudioDTO animeStudioDTO);
}
