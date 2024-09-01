package com.proyect.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class PropiedadesDto {
    public int propiedadesId;
    public String nombre;
    public String ubicacion;
    public String urlImagen;
    public Boolean disponibilidad;
    public Date fechaArrendamiento;
}
