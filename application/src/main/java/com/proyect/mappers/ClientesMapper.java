package com.proyect.mappers;
import com.proyect.entities.Clientes;
import com.proyect.models.ClientesModels;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
public interface ClientesMapper {
    ClientesMapper INSTANCE = Mappers.getMapper(ClientesMapper.class);

    @Mapping(source = "usuarioId", target = "usuarioId")
    ClientesModels entityToModel(Clientes entity);

    @Mapping(source = "usuarioId", target = "usuarioId")
    Clientes modelToEntity(ClientesModels model);
}
