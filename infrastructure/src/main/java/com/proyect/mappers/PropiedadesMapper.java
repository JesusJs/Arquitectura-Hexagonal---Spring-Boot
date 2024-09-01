package com.proyect.mappers;


import com.proyect.dtos.PropiedadesDto;
import com.proyect.entities.Propiedades;
import com.proyect.models.PropiedadesModels;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
public interface PropiedadesMapper {
    PropiedadesMapper INSTANCE = Mappers.getMapper(PropiedadesMapper.class);

    @Mapping(source = "propiedadesId", target = "propiedadesId")
    PropiedadesDto modelToDto(PropiedadesModels model);

    @Mapping(source = "propiedadesId", target = "propiedadesId")
    PropiedadesModels dtoToModel(PropiedadesDto dto);

    @Mapping(source = "propiedadesId", target = "propiedadesId")
    PropiedadesModels entityToModel(Propiedades entity);

    @Mapping(source = "propiedadesId", target = "propiedadesId")
    Propiedades modelToEntity(PropiedadesModels model);
}
