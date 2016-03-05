package pe.veli.eurekabank.dao.espec;

import java.util.List;

import pe.veli.eurekabank.model.EmpleadoBean;




public interface EmpleadoDaoEspec {

  
	EmpleadoBean getEmpleadoPorUsuario(String usuario, String clave);

	List<EmpleadoBean> getEmpleados(EmpleadoBean empleadoBean);

}
