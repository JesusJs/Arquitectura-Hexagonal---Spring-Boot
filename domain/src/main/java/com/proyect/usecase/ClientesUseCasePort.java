package com.proyect.usecase;

import com.proyect.entities.Clientes;
import com.proyect.models.ClientesModels;

public interface ClientesUseCasePort {
    Clientes GetSession(ClientesModels client);
    String InfoReturn();
}
