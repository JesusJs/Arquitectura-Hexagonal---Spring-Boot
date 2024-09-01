package com.proyect.repository;

import com.proyect.entities.Clientes;
import com.proyect.models.ClientesModels;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository implements ClientesRepositoryPort{

    private JdbcTemplate jdbc;

    public ClientRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    @Override
    public Clientes GetSession(ClientesModels client) {
        return null;
    }

    @Override
    public String InfoReturn() {
        return "Estamos llamando al repository";
    }
}
