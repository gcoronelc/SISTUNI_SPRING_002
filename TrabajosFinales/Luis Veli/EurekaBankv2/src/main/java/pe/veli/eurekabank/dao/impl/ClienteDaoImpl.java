package pe.veli.eurekabank.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import pe.veli.eurekabank.dao.espec.ClienteDaoEspec;
import pe.veli.eurekabank.mapper.ClienteMapper;
import pe.veli.eurekabank.model.ClienteBean;


@Repository
public class ClienteDaoImpl extends AbstractDao implements ClienteDaoEspec{

  @Override
  public List<ClienteBean> getClientes(ClienteBean clienteBean) {
    String sql = "select "
        + "chr_cliecodigo, vch_cliepaterno, "
        + "vch_cliematerno, vch_clienombre, "
        + "chr_cliedni, vch_clieciudad, "
        + "vch_cliedireccion, vch_clietelefono, "
        + "vch_clieemail  from cliente "
        + "where chr_cliecodigo like ? "
        + "and vch_cliepaterno like ? "
        + "and vch_cliematerno like ? "
        + "and vch_clienombre like ? ";
    	//Parametros
    String p1 = clienteBean.getCodigo() + "%";
    String p2 = clienteBean.getPaterno() + "%";
    String p3 = clienteBean.getMaterno() + "%";
    String p4 = clienteBean.getNombre() + "%";
    String[] args = {p1, p2, p3,p4};
    List<ClienteBean> lista;
    lista = jdbcTemplate.query(sql, args, new ClienteMapper());
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
    int filas = jdbcTemplate.update(sql, args);
    System.out.println("Filas actualizadas: " + filas);
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
 
}
