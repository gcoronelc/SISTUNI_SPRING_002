package pe.veli.eurekabank.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.veli.eurekabank.model.*;;


public class EmpleadoMapper implements RowMapper<EmpleadoBean> {

	@Override
	public EmpleadoBean mapRow(ResultSet rs, int i) throws SQLException {
		EmpleadoBean bean = new EmpleadoBean();
		bean.setCodigo(rs.getString("chr_emplcodigo"));
		bean.setPaterno(rs.getString("vch_emplpaterno"));
		bean.setMaterno(rs.getString("vch_emplmaterno"));
		bean.setNombre(rs.getString("vch_emplnombre"));
		bean.setCiudad(rs.getString("vch_emplciudad"));
		bean.setDireccion(rs.getString("vch_empldireccion"));
		bean.setUsuario(rs.getString("vch_emplusuario"));
		return bean;
	}

}
