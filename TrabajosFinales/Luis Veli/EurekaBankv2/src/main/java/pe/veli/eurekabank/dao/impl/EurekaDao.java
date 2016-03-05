package pe.veli.eurekabank.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import pe.veli.eurekabank.mapper.EmpleadoMapper;
import pe.veli.eurekabank.model.EmpleadoBean;

@Repository
public class EurekaDao extends AbstractDao {

	public int cantCuentas() {
		String sql = "select count(*) from cuenta";
		int rowCount = jdbcTemplate.queryForObject(sql, Integer.class);
	  return rowCount;
  }

	public List<EmpleadoBean> traerEmpleados(String paterno) {
		String sql = "select chr_emplcodigo, vch_emplpaterno, "
		    + "vch_emplmaterno, vch_emplnombre, vch_emplciudad, "
		    + "vch_empldireccion, vch_emplusuario "
		    + "from empleado where vch_emplpaterno like ?";
		Object[] parms = { paterno + "%" };
		List<EmpleadoBean> lista = jdbcTemplate.query(sql, parms, new EmpleadoMapper());
	  return lista;
  }

}
