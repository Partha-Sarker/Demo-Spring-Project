package com.example.demo.helper.mapper;

import com.example.demo.database.model.AnimeGenre;
import com.example.demo.helper.dto.AnimeGenreDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimeGenreMapper {
    AnimeGenreMapper INSTANCE = Mappers.getMapper(AnimeGenreMapper.class);

    @Mapping(source = "anime.id", target = "animeId")
    @Mapping(source = "genre.id", target = "genreId")
    AnimeGenreDTO animeGenreToAnimeGenreDTO(AnimeGenre animeGenre);
    @InheritInverseConfiguration
    AnimeGenre animeGenreDTOToAnimeGenre(AnimeGenreDTO animeGenreDTO);
}
