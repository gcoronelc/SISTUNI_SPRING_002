package com.javarevolutions.spring.service.iface;

import java.util.List;

import com.javarevolutions.spring.dominio.ClientesBean;

public interface ClientesService {
    public boolean insertaCliente(ClientesBean obj) throws Exception;
    public boolean borraCliente(ClientesBean obj) throws Exception;
    public boolean actualizaCliente(ClientesBean obj) throws Exception;
    public List<ClientesBean> consultaClientes() throws Exception;
    public ClientesBean getClientePorId(ClientesBean obj) throws Exception;
}
