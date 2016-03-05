package com.javarevolutions.spring.entity;

import java.io.Serializable;

public class Index implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 4584825728214311533L;
    private String usuario;
    private String password;
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
