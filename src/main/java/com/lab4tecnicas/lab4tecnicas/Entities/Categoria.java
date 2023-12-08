package com.lab4tecnicas.lab4tecnicas.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;
    private String NombreCategoria;
    private String Contenidos;
    private String fechaPublicacion;


    public Integer getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNombreCategoria() {
        return NombreCategoria;
    }
    public void setNombreCategoria(String nombreCategoria) {
        NombreCategoria = nombreCategoria;
    }
    public String getContenidos() {
        return Contenidos;
    }
    public void setContenidos(String contenidos) {
        Contenidos = contenidos;
    }
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

 
    public String crearCategoria (String NombreCategoria){
        return "Categoria" + this.NombreCategoria + "fue creada";
    }
    
     public String publicarContenido (String Contenidos){
        return "Contenido" + this.Contenidos + "fue publicado el" + this.fechaPublicacion;
    } 
}
