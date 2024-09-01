package com.proyect.usecase;

import com.proyect.entities.Propiedades;
import com.proyect.models.PropiedadesModels;
import com.proyect.repository.PropiedadesRepositoryPort;

import java.util.List;

public class PropiedadesUseCase implements PropertiesUseCasePort{

    private PropiedadesRepositoryPort propiedadesRepository;

    public PropiedadesUseCase(PropiedadesRepositoryPort propiedadesRepository){
        this.propiedadesRepository = propiedadesRepository;
    }

    @Override
    public Propiedades add(PropiedadesModels data) {
        return null;
    }

    @Override
    public void edit(PropiedadesModels data) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Propiedades> list(int minPrice, int maxPrice) {
        return List.of();
    }

    @Override
    public Propiedades update(PropiedadesModels data) {
        return null;
    }
}
