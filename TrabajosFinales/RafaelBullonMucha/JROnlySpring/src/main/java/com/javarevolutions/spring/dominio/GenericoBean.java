package com.javarevolutions.spring.dominio;

import java.io.Serializable;

public class GenericoBean implements Serializable {
    private static final long serialVersionUID = -3046602426623981372L;
    private String mensaje;
    private Boolean status;
    private String accion;

    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getAccion() {
        return accion;
    }
    public void setAccion(String accion) {
        this.accion = accion;
    }
}
