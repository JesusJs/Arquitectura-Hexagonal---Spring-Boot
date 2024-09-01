package com.proyect.repository;
import com.proyect.entities.Propiedades;
import com.proyect.models.PropiedadesModels;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PropiedadesRepositoryPort {

    Propiedades add(PropiedadesModels data);

    void edit(PropiedadesModels data);

    void delete(int id);

    List<Propiedades> list(int minPrice, int maxPrice);

    Propiedades update(PropiedadesModels data);
}
