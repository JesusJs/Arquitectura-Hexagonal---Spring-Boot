package com.proyect.usecase;

import com.proyect.entities.Propiedades;
import com.proyect.models.PropiedadesModels;

import java.util.List;

public interface PropertiesUseCasePort {
    Propiedades add(PropiedadesModels data);
    void edit(PropiedadesModels data);
    void delete(int id);
    List<Propiedades> list(int minPrice, int maxPrice);
    Propiedades update(PropiedadesModels data);
}
