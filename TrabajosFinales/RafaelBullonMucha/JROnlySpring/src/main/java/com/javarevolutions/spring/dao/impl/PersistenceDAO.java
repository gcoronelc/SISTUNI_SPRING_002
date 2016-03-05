package com.javarevolutions.spring.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public abstract class PersistenceDAO extends JdbcDaoSupport {
    private String esquema;

    /**
     * Este método obtiene el esquema de la base de datos
     * @return esquema
     */
    public String getEsquema() {
        return esquema;
    }
    /**
     * Este método establece el esquema de la base de datos
     * @param esquema
     */
    public void setEsquema(String esquema) {
        this.esquema = esquema;
    }
    @Transactional
    public abstract boolean agregar(Object obj) throws Exception;
    @Transactional
    public abstract boolean borrar(Object obj) throws Exception;
    @Transactional
    public abstract boolean actualizar(Object obj) throws Exception;
    public abstract List<?> obtenerLista() throws Exception;
    public abstract Object obtenerObjetoPorId(Object obj) throws Exception;
}
