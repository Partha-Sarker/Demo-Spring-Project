package com.example.demo.helper.mapper;

import com.example.demo.database.model.AnimeGenre;
import com.example.demo.helper.dto.AnimeGenreDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimeGenreMapper {
    AnimeGenreMapper INSTANCE = Mappers.getMapper(AnimeGenreMapper.class);

    AnimeGenreDTO animeGenreToAnimeGenreDTO(AnimeGenre animeGenre);
    AnimeGenre animeGenreDTOToAnimeGenre(AnimeGenreDTO animeGenreDTO);
}
