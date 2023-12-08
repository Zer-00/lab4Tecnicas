/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab4tecnicas.lab4tecnicas.Entities;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gabyt
 */
public class Valoraciones {
    
 
  private Map<String, Double> valoraciones; // Almacena las valoraciones por ID del usuario
  
    private Map<String, String> comentarios; // Almacena los comentarios por ID del usuario
    private User user;

    public Valoraciones() {
        valoraciones = new HashMap<>();
        comentarios = new HashMap<>();
    }
    
    public Valoraciones (User user){
        this.user = user;
    }
    
     public User getUser() {
        return user;
    }

    public void agregarValoracion(String idUsuario, double valoracion) {
        valoraciones.put(idUsuario, valoracion);
        System.out.println("¡Valoración de " + valoracion + " agregada para el usuario " + idUsuario + "!");
    }

    public double obtenerValoracion(String idUsuario) {
        return valoraciones.getOrDefault(idUsuario, 0.0); // Devuelve 0 si no se encuentra la valoración
    }

    public void agregarComentario(String idUsuario, String comentario) {
        comentarios.put(idUsuario, comentario);
        System.out.println("¡Comentario agregado para el usuario " + idUsuario + "!");
    }

    public String obtenerComentario(String idUsuario) {
        return comentarios.getOrDefault(idUsuario, "Usuario sin comentario");
    }

    public static void main(String[] args) {
        Valoraciones sitioWeb = new Valoraciones();

        // Agregar valoraciones y comentarios
        sitioWeb.agregarValoracion("usuario123", 4.5);
        sitioWeb.agregarComentario("usuario123", "¡Me encanta este sitio!");

        // Obtener valoraciones y comentarios
        System.out.println(sitioWeb.obtenerValoracion("usuario123")); // Salida: 4.5
        System.out.println(sitioWeb.obtenerComentario("usuario123")); // Salida: ¡Me encanta este sitio!
    }
}
    

