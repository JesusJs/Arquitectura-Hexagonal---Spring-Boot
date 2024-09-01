package com.proyect.usecase;

import com.proyect.entities.Clientes;
import com.proyect.models.ClientesModels;
import com.proyect.repository.ClientesRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class ClientUseCase implements ClientesUseCasePort{

    private ClientesRepositoryPort clientesRepository;

    public ClientUseCase(ClientesRepositoryPort clientesRepository){
        this.clientesRepository = clientesRepository;
    }

    @Override
    public Clientes GetSession(ClientesModels client) {
        return null;
    }

    @Override
    public String InfoReturn(){
        return clientesRepository.InfoReturn();
    }
}
