package pe.veli.eurekabank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.veli.eurekabank.dao.impl.EurekaDao;
import pe.veli.eurekabank.model.EmpleadoBean;

@Service
public class EmpleadoService {

	@Autowired
	private EurekaDao eurekaDao;

	public List<EmpleadoBean> traerEmpleado(String paterno) {
		return eurekaDao.traerEmpleados(paterno);
	}

	
}
