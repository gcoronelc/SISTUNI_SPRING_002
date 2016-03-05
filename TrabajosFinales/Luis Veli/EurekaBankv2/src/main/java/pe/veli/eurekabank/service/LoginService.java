package pe.veli.eurekabank.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.veli.eurekabank.dao.espec.EmpleadoDaoEspec;
import pe.veli.eurekabank.model.EmpleadoBean;


@Service
public class LoginService {

	  @Autowired
	  private EmpleadoDaoEspec empleadoDao;
	
	public EmpleadoBean validar(String usuario, String clave) {
	  if(usuario.isEmpty()){
	  	throw new RuntimeException("Faltan datos.");
	  }
	  if(clave.isEmpty()){
	  	throw new RuntimeException("Faltan datos.");
	  }
	  
	  EmpleadoBean bean = empleadoDao.getEmpleadoPorUsuario(usuario, clave);
	  if(bean == null){
	  	throw new RuntimeException("Datos incorrectos.");
	  }
	  return bean;
  }

}
