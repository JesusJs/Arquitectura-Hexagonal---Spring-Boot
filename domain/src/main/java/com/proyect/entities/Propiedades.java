package com.proyect.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Propiedades {
    public int propiedadesId;
    public String nombre;
    public String ubicacion;
    public String urlImagen;
    public Boolean disponibilidad;
    public Date fechaArrendamiento;
}
