package com.lab4tecnicas.lab4tecnicas.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Table(name = "autors")
@Entity(name = "autor")
@Getter //Genera Getters Lombok
@Setter //Genera Setters Lombok
@NoArgsConstructor //Genera Constructor Vacio Lombok
@AllArgsConstructor //Genera Construtor con Parametros Lombok
@EqualsAndHashCode(of = "id") // Para comparaciones entre entidades Lombok
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private String profilePictureUrl;

    private String socialMediaUrl;

    private String contactEmail;

    private LocalDateTime joiningDate;

    private Boolean status;

    //Noticias del Usuario
    private ArrayList<Noticia> autorNews = new ArrayList<>();

    /**
     * Obtener estado del Autor
     * @return
     */
    public String getAutorStatus(){
        String message = "No se conoce el estado.";

        if(this.status = false){
            message = "Autor Inactivo";
        }
        if(this.status = true){
            message = "Autor Activo";
        }

        return message;
    }

    /**
     * Obtener Nombre Completo del Autor
     * @return
     */
    public String fullName(){
        return this.firstName + " " + this.lastName;
    }



    /**
     * Retorna la ultima noticia del Autor
     * @return
     */
    public Noticia getLastNew(){

        return new Noticia();
    }

    /**
     * Retorna la primera noticia del Autor
     * @return
     */
    public Noticia getfirstNew(){

        return new Noticia();
    }

    /**
     * Retorna el total de noticias Publicadas por el Autor
     * @return
     */
    public Integer getTotalNews(){

        ArrayList<Noticia> noticias = new ArrayList<>();

        return noticias.size();
    }

    /**
     * Retorna el total de noticias Publicadas por el Autor
     * @return
     */
    public ArrayList<Noticia> getAllNews(){


        ArrayList<Noticia> noticias = new ArrayList<>();


        return noticias;
    }

    /**
     * Retorna n Noticias mas populares del Autor
     * @param nNews n Cantidad de noticias a retornar
     * @return
     */
    public ArrayList<Noticia> getMostPopularNews(Integer nNews){

        Integer totalNoticias =  this.getTotalNews();

        ArrayList<Noticia> popularNews = new ArrayList<>();

        ArrayList<Noticia> allNews = getAllNews();

        Integer nCounter = 0;

        // Iteracion
        for(Integer i = 0; i< totalNoticias; i++){
            //validar que la noticia es popular
            if(allNews.get(i).getTipoNoticia() == "Popular"){
                //validacion
                if(nCounter>=nNews){
                    break;
                }

                //Agregamos Noticia
                popularNews.add(allNews.get(i));

                //Sumamos Contador
                nCounter++;
            }
        }

        return popularNews;
    }

    /**
     * Retorna n Noticias menos populares del Autor
     * @param nNews n Cantidad de noticias a retornar
     * @return
     */
    public ArrayList<Noticia> getLessPopularNews(Integer nNews){

        Integer totalNoticias =  this.getTotalNews();

        ArrayList<Noticia> lessPopularNews = new ArrayList<>();

        ArrayList<Noticia> allNews = getAllNews();

        Integer nCounter = 0;

        // Iteracion
        for(Integer i = 0; i< totalNoticias; i++){
            //validar que la noticia es popular
            if(allNews.get(i).getTipoNoticia() == "No Popular"){
                //validacion
                if(nCounter>=nNews){
                    break;
                }

                //Agregamos Noticia
                lessPopularNews.add(allNews.get(i));

                //Sumamos Contador
                nCounter++;
            }
        }

        return lessPopularNews;
    }

}
