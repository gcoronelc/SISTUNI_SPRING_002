package pe.egcc.appspringjdbc.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import pe.egcc.appspringjdbc.dao.espec.ClienteDaoEspec;
import pe.egcc.appspringjdbc.dao.espec.UsuarioDaoCrudEspec;
import pe.egcc.appspringjdbc.dao.espec.UsuarioDaoEspec;
import pe.egcc.appspringjdbc.domain.UsuarioBean;

@Repository
public class UsuarioDaoImpl extends AbstractDao implements UsuarioDaoCrudEspec{
  
  private String columnasCliente = " chr_cliecodigo codigo,"
      + "vch_cliepaterno paterno, "
      + "vch_cliematerno materno, "
      + "vch_clienombre nombre, "
      + "chr_cliedni dni, "
      + "vch_clieciudad ciudad, "
      + "vch_cliedireccion direccion, "
      + "vch_clietelefono telefono, "
      + "vch_clieemail email ";
  
  private String columnasUsuario = " id,"
	      + "uapaterno, "
	      + "uamaterno, "
	      + "uanombres, "
	      + "usuario, "
	      + "clave, "
	      + "cargo_id, "
	      + "dni, "
	      + "correo, "
	      + "equipo, "
	      + "ruta ";
  
  @SuppressWarnings("unchecked")
  @Override
  public UsuarioBean getForID(String codigo) {
    String sql = "select " + columnasCliente 
        + " from cliente where chr_cliecodigo = ?";
    String[] args = {codigo};
    UsuarioBean bean = null;
    try {
      bean = (UsuarioBean) jdbcTemplate.queryForObject(sql, args, 
          new BeanPropertyRowMapper(UsuarioBean.class));
    } catch (EmptyResultDataAccessException e) {
      bean = null;
    }
    return bean;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<UsuarioBean> getForCriterio(UsuarioBean bean) {
    List<UsuarioBean> lista = null;
    String sql = "select " + columnasUsuario 
        + " from t_usuario order by id";
//        + "where vch_cliepaterno like nvl(?,'%')  "
//        + "and vch_cliematerno like ? "
//        + "and vch_clienombre like ? ";
    // Parametros
//    String p1 = bean.getPaterno() + "%";
//    String p2 = bean.getMaterno() + "%";
//    String p3 = bean.getNombre() + "%";
//    String[] args = {p1, p2, p3};
    lista = jdbcTemplate.query(sql, new BeanPropertyRowMapper(UsuarioBean.class));
    return lista;
  }

  @Override
  @Transactional(rollbackFor=Exception.class)
  public void insertar(UsuarioBean bean) {
    // Leer datos para el codigo
    String sql = "select max(id) as id "
        + "from t_usuario ";
//        + "FOR UPDATE";
    Map<String, Object> map;
    map = jdbcTemplate.queryForMap(sql);
    int cont = Integer.parseInt(map.get("id").toString());
    // Crear código
    cont++;
//    // Actualizar contador
//    sql = "update contador set int_contitem = ? "
//        + "where vch_conttabla = 'Cliente' ";
    Object[] args = {cont};
//    jdbcTemplate.update(sql, args);
    // Insertar el nuevo cliente
    sql = "insert into t_usuario(id, uapaterno, "
        + "uamaterno, uanombres, usuario, clave, "
        + "dni, correo) values(?,?,?,?,?,?,?,?)";
    args = new Object[]{cont, bean.getUapaterno(), bean.getUamaterno(),
        bean.getUanombres(), bean.getUsuario(), bean.getClave(),
        bean.getDni(), bean.getCorreo()};
    jdbcTemplate.update(sql, args);
    // Retornar el codigo
    //bean.setUsu;
  }

  @Override
  public void actualizar(UsuarioBean bean) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void eliminar(String codigo) {
	  String sql = "delete from t_usuario where id = "+codigo;
	  jdbcTemplate.execute(sql);
    
  }
  
  @Override
  public UsuarioBean getForUsuarioClave(String usuario, String clave){
	  String sql = "select " + columnasUsuario 
		        + " from t_usuario where usuario = ? and clave = ?";
		    String[] args = {usuario, clave};
		    UsuarioBean bean = null;
		    try {
		      bean = (UsuarioBean) jdbcTemplate.queryForObject(sql, args, 
		          new BeanPropertyRowMapper(UsuarioBean.class));
		    } catch (EmptyResultDataAccessException e) {
		      bean = null;
		    }
		    return bean;
  }
  
  public static void main(String[] args) {
    String codigo = String.format("00000000000%d", 5);
    codigo = codigo.substring(codigo.length() - 5);
    System.out.println(codigo);
  }

}
