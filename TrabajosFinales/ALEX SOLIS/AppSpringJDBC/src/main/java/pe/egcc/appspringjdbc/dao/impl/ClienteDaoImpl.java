package pe.egcc.appspringjdbc.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import pe.egcc.appspringjdbc.dao.espec.ClienteDaoEspec;
import pe.egcc.appspringjdbc.domain.ClienteBean;

@Repository
public class ClienteDaoImpl extends AbstractDao implements ClienteDaoEspec{
  
  private String columnasCliente = " chr_cliecodigo codigo,"
      + "vch_cliepaterno paterno, "
      + "vch_cliematerno materno, "
      + "vch_clienombre nombre, "
      + "chr_cliedni dni, "
      + "vch_clieciudad ciudad, "
      + "vch_cliedireccion direccion, "
      + "vch_clietelefono telefono, "
      + "vch_clieemail email ";
  
  @SuppressWarnings("unchecked")
  @Override
  public ClienteBean getForID(String codigo) {
    String sql = "select " + columnasCliente 
        + " from cliente where chr_cliecodigo = ?";
    String[] args = {codigo};
    ClienteBean bean = null;
    try {
      bean = (ClienteBean) jdbcTemplate.queryForObject(sql, args, 
          new BeanPropertyRowMapper(ClienteBean.class));
    } catch (EmptyResultDataAccessException e) {
      bean = null;
    }
    return bean;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<ClienteBean> getForCriterio(ClienteBean bean) {
    List<ClienteBean> lista;
    String sql = "select " + columnasCliente 
        + " from cliente "
        + "where vch_cliepaterno like nvl(?,'%')  "
        + "and vch_cliematerno like ? "
        + "and vch_clienombre like ? ";
    // Parametros
    String p1 = bean.getPaterno() + "%";
    String p2 = bean.getMaterno() + "%";
    String p3 = bean.getNombre() + "%";
    String[] args = {p1, p2, p3};
    lista = jdbcTemplate.query(sql, args, new BeanPropertyRowMapper(ClienteBean.class));
    return lista;
  }

  @Override
  @Transactional(rollbackFor=Exception.class)
  public void insertar(ClienteBean bean) {
    // Leer datos para el codigo
    String sql = "select int_contitem, int_contlongitud "
        + "from contador "
        + "where vch_conttabla = 'Cliente' "
        + "FOR UPDATE";
    Map<String, Object> map;
    map = jdbcTemplate.queryForMap(sql);
    int cont = Integer.parseInt(map.get("int_contitem").toString());
    int size = Integer.parseInt(map.get("int_contlongitud").toString());
    // Crear código
    cont++;
    String codigo = String.format("00000000000%d", cont);
    codigo = codigo.substring(codigo.length() - size);
    // Actualizar contador
    sql = "update contador set int_contitem = ? "
        + "where vch_conttabla = 'Cliente' ";
    Object[] args = {cont};
    jdbcTemplate.update(sql, args);
    // Insertar el nuevo cliente
    sql = "insert into cliente(chr_cliecodigo, vch_cliepaterno, "
        + "vch_cliematerno, vch_clienombre, chr_cliedni, "
        + "vch_clieciudad, vch_cliedireccion, vch_clietelefono,"
        + "vch_clieemail) values(?,?,?,?,?,?,?,?,?)";
    args = new Object[]{codigo, bean.getPaterno(), bean.getMaterno(),
        bean.getNombre(), bean.getDni(), bean.getCiudad(),
        bean.getDireccion(), bean.getTelefono(), bean.getEmail()};
    jdbcTemplate.update(sql, args);
    // Retornar el codigo
    bean.setCodigo(codigo);
  }

  @Override
  public void actualizar(ClienteBean bean) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void eliminar(String codigo) {
    // TODO Auto-generated method stub
    
  }
  
  public static void main(String[] args) {
    String codigo = String.format("00000000000%d", 5);
    codigo = codigo.substring(codigo.length() - 5);
    System.out.println(codigo);
  }

}
