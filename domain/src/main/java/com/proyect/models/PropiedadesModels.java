package com.proyect.models;

import lombok.Data;

import java.util.Date;

@Data
public class PropiedadesModels {
    public int propiedadesId;
    public String nombre;
    public String ubicacion;
    public String urlImagen;
    public Boolean disponibilidad;
    public Date fechaArrendamiento;
}
