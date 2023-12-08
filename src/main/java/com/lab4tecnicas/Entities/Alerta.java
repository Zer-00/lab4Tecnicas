package com.lab4tecnicas.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alerta {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;

    private String tipo;

    private String descripcion;


    public String MostrarAlerta () {

        return titulo + descripcion;
    }
}
