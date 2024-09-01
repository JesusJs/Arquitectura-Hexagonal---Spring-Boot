package com.proyect.repository;

import com.proyect.entities.Clientes;
import com.proyect.entities.Propiedades;
import com.proyect.models.ClientesModels;
import com.proyect.models.PropiedadesModels;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PropiedadesRepository implements PropiedadesRepositoryPort{

    private JdbcTemplate jdbc;

    public PropiedadesRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
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
