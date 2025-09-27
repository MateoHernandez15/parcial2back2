package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ICineMapa {

    ICineMapa INSTANCE = Mappers.getMapper(ICineMapa.class);

    @Mapping(target = "numeroSalas", expression = "java(cine.getSalas() == null ? 0 : cine.getSalas().size())")
    CineDTO toDto(Cine cine);

    Cine toEntity(CineDTO dto);
}
