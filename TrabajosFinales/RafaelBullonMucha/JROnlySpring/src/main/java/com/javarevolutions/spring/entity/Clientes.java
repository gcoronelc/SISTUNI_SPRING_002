package com.javarevolutions.spring.entity;

import java.io.Serializable;
import java.sql.Date;

public class Clientes implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2286378858501851031L;
    private String id;
    private String nombre;
    private String app;
    private String apm;
    private String fecha_nacimiento;
    private String sexo;
    private Index usuario;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApp() {
        return app;
    }
    public void setApp(String app) {
        this.app = app;
    }
    public String getApm() {
        return apm;
    }
    public void setApm(String apm) {
        this.apm = apm;
    }
    public String  getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Index getUsuario() {
        return usuario;
    }
    public void setUsuario(Index usuario) {
        this.usuario = usuario;
    }
}
