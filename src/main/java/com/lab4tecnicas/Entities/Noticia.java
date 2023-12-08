package com.lab4tecnicas.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNoticia;
    private String tituloNoticia;
    private String cuerpoNoticia;
    private String subtitleNoticia;
    private String linkImg;
    private String tipoNoticia;

    public Integer getIdNoticia() {
        return idNoticia;
    }
    public void setIdNoticia(Integer idNoticia) {
        this.idNoticia = idNoticia;
    }
    public String getTituloNoticia() {
        return tituloNoticia;
    }
    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }
    public String getCuerpoNoticia() {
        return cuerpoNoticia;
    }
    public void setCuerpoNoticia(String cuerpoNoticia) {
        this.cuerpoNoticia = cuerpoNoticia;
    }
    public String getSubtitleNoticia() {
        return subtitleNoticia;
    }
    public void setSubtitleNoticia(String subtitleNoticia) {
        this.subtitleNoticia = subtitleNoticia;
    }
    public String getLinkImg() {
        return linkImg;
    }
    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

 public String getTipoNoticia() {
        return tipoNoticia;
    }
    public void setTipoNoticia(String tipoNoticia) {
        this.tipoNoticia = tipoNoticia;
    }

    public String publicarNoticia(String tipoNoticia){
        return this.tituloNoticia + "fue publicada";
    }

    public String borrarNoticia(String idNoticia){
        return this.idNoticia + "fue borrada";
    }
    
    
}
   