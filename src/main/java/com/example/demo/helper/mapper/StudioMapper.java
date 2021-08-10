package com.example.demo.helper.mapper;

import com.example.demo.database.model.Studio;
import com.example.demo.helper.dto.StudioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudioMapper {
    StudioMapper INSTANCE = Mappers.getMapper(StudioMapper.class);

    StudioDTO studioToStudioDTO(Studio studio);
    Studio studioDTOToStudio(StudioDTO studioDTO);
}
