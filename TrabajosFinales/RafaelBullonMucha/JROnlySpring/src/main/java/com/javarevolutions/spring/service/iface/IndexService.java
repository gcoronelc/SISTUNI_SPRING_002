package com.javarevolutions.spring.service.iface;

import java.util.List;

import com.javarevolutions.spring.dominio.IndexBean;

public interface IndexService {
    public boolean validaLogin(IndexBean obj) throws Exception;
    public boolean insertaUsuario(IndexBean obj) throws Exception;
    public boolean borraUsuario(IndexBean obj) throws Exception;
    public boolean actualizaUsuario(IndexBean obj) throws Exception;
    public List<IndexBean> consultaUsuarios() throws Exception;
    public IndexBean getUsuarioPorId(IndexBean obj) throws Exception;
}
