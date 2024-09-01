package com.proyect.apirest.controllers;

import com.proyect.usecase.ClientesUseCasePort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesControllers {

    private final ClientesUseCasePort clientesUseCase;

    public ClientesControllers(ClientesUseCasePort clientesUseCase){
        this.clientesUseCase = clientesUseCase;
    }

    @GetMapping("/obtener")
    public String get(){
        return clientesUseCase.InfoReturn();
    }

}
