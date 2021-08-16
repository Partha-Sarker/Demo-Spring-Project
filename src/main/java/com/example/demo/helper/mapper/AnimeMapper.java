package com.example.demo.helper.mapper;

import com.example.demo.database.model.Anime;
import com.example.demo.helper.dto.AnimeDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimeMapper {
    AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    AnimeDTO animeToAnimeDTO(Anime anime);
    @Mapping(target = "id", ignore = true)
    Anime animeDTOToAnime(AnimeDTO animeDTO);
}
