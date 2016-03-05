package com.javarevolutions.spring.dao.iface;

import java.util.List;

import com.javarevolutions.spring.entity.Clientes;

public interface ClientesDAO {
    public boolean insertaCliente(Clientes entity) throws Exception;
    public boolean borraCliente(Clientes entity) throws Exception;
    public boolean actualizaCliente(Clientes entity) throws Exception;
    public List<Clientes> consultaClientes() throws Exception;
    public Clientes getClientePorId(Clientes entity) throws Exception;
}
