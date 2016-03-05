package pe.veli.eurekabank.dao.impl;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import pe.veli.eurekabank.dao.espec.EmpleadoDaoEspec;
import pe.veli.eurekabank.mapper.EmpleadoMapper;
import pe.veli.eurekabank.model.EmpleadoBean;



@Repository
public class EmpleadoDaoImpl extends AbstractDao implements EmpleadoDaoEspec{

  @Override
  public EmpleadoBean getEmpleadoPorUsuario(String usuario, String clave) {
    EmpleadoBean empleadoBean=null;
	    try { String sql = "select chr_emplcodigo, vch_emplpaterno, "
	    		+ "vch_emplmaterno, vch_emplnombre, vch_emplciudad, "
	    		+ "vch_empldireccion, vch_emplusuario "
	    		+ "from empleado where vch_emplusuario = ? "
	    		+ "and vch_emplclave = ?";
    Object[] args = {usuario,clave};

    empleadoBean = jdbcTemplate.queryForObject(sql, args, new EmpleadoMapper());
	    } catch (EmptyResultDataAccessException e) {
	    }
    return empleadoBean;
  }
  


  @Override
  public List<EmpleadoBean> getEmpleados(EmpleadoBean empleadoBean) {
    // TODO Auto-generated method stub
    return null;
  }

}
