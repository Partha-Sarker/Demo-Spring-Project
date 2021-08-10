package com.example.demo.helper.mapper;

import com.example.demo.database.model.Genre;
import com.example.demo.helper.dto.GenreDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenreMapper {
    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);

    GenreDTO genreToGenreDTO(Genre genre);
    Genre genreDTOToGenre(GenreDTO genreDTO);
}
