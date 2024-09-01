package com.proyect.repository;

import com.proyect.entities.Clientes;
import com.proyect.models.ClientesModels;

public interface ClientesRepositoryPort {
    Clientes GetSession(ClientesModels client);
    String InfoReturn();
}
