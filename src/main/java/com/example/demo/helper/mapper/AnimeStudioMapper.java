package com.example.demo.helper.mapper;

import com.example.demo.database.model.AnimeStudio;
import com.example.demo.helper.dto.AnimeStudioDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimeStudioMapper {
    AnimeStudioMapper INSTANCE = Mappers.getMapper(AnimeStudioMapper.class);

    @Mapping(source = "anime.id", target = "animeId")
    @Mapping(source = "studio.id", target = "studioId")
    AnimeStudioDTO animeStudioToAnimeStudioDTO(AnimeStudio animeStudio);
    @InheritInverseConfiguration
    AnimeStudio animeStudioDTOToAnimeStudio(AnimeStudioDTO animeStudioDTO);
}
