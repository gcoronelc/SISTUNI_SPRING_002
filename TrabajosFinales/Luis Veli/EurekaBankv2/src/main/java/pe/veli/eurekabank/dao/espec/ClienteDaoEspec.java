package pe.veli.eurekabank.dao.espec;

import java.util.List;

import pe.veli.eurekabank.model.ClienteBean;



public interface ClienteDaoEspec {
  
  List<ClienteBean> getClientes(ClienteBean clienteBean);

  	void insertar(ClienteBean bean);
 
  

}
