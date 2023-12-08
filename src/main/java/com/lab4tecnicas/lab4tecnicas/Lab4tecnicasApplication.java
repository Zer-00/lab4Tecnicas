package com.lab4tecnicas.lab4tecnicas;

import com.lab4tecnicas.lab4tecnicas.Entities.Valoraciones;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab4tecnicasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4tecnicasApplication.class, args);
                
                {
        Valoraciones sitioWeb = new Valoraciones();

        // Agregar valoraciones y comentarios
        sitioWeb.agregarValoracion("usuario123", 4.5);
        sitioWeb.agregarComentario("usuario123", "¡Me encanta este sitio!");

        // Obtener valoraciones y comentarios
        System.out.println(sitioWeb.obtenerValoracion("usuario123")); // Salida: 4.5
        System.out.println(sitioWeb.obtenerComentario("usuario123")); // Salida: ¡Me encanta este sitio!
    }
	}

}
