package com.lab4tecnicas.Entities;

import jakarta.persistence.Entity;

@Entity
public class user {
    

    private Integer idUser;
    private String username;
    private String password;
    
    public Integer getIdUser() {
        return idUser;
    }
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    


}
