package pe.egcc.appspringjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.egcc.appspringjdbc.dao.espec.ClienteDaoEspec;
import pe.egcc.appspringjdbc.domain.ClienteBean;

@Service
public class ClienteService {

  @Autowired
  private ClienteDaoEspec clienteDao;
  
  public ClienteBean getCliente(String codigo){
    return clienteDao.getForID(codigo);
  }

  public List<ClienteBean> getClientes(ClienteBean clienteBean) {
    return clienteDao.getForCriterio(clienteBean);
  }
  
  public void insertar(ClienteBean clienteBean){
    clienteDao.insertar(clienteBean);
  }
  
}
