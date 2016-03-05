package pe.veli.eurekabank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.veli.eurekabank.dao.espec.ClienteDaoEspec;
import pe.veli.eurekabank.model.ClienteBean;


@Service
public class ClienteService {

  @Autowired
  private ClienteDaoEspec clienteDao;
  
  public List<ClienteBean> getClientes(ClienteBean clienteBean){
    clienteBean.establecerDatos();
    return clienteDao.getClientes(clienteBean);
  }

public void insertar(ClienteBean clienteBean) {
	clienteDao.insertar(clienteBean);
}
}
