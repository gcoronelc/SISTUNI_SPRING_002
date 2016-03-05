package com.mancris.ventas.dao.impl;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mancris.ventas.dao.espec.CrudUsuarioEspec;
import com.mancris.ventas.domain.UsuarioBean;

@SuppressWarnings({ "unchecked", "rawtypes" })
@Repository

public class CrudUsuarioImpl extends AbstractDao implements CrudUsuarioEspec{
  @Override
  public UsuarioBean traerPorCodigo(String codigo) {
    UsuarioBean bean = null;
    /*String sql = "select "
        + "chr_cliecodigo     codigo, "
        + "vch_cliepaterno    paterno, "
        + "vch_cliematerno    materno, "
        + "vch_clienombre     nombre, "
        + "chr_cliedni        dni, "
        + "vch_clieciudad     ciudad, "
        + "vch_cliedireccion  direccion, "
        + "vch_clietelefono   telefono, "
        + "vch_clieemail      email "
        + "from Usuario "
        + "where chr_cliecodigo = ? ";
    Object[] args = {codigo};
    try{
      bean = jdbcTemplate.queryForObject(sql, args, new BeanPropertyRowMapper(UsuarioBean.class));
    } catch(EmptyResultDataAccessException e){
      bean = null;
    }*/
    return bean;
  }

  
  @Override
  public List<UsuarioBean> traerPorNombre(UsuarioBean bean) {
    List<UsuarioBean> lista = null;
    /*String sql = "select "
        + "chr_cliecodigo     codigo, "
        + "vch_cliepaterno    paterno, "
        + "vch_cliematerno    materno, "
        + "vch_clienombre     nombre, "
        + "chr_cliedni        dni, "
        + "vch_clieciudad     ciudad, "
        + "vch_cliedireccion  direccion, "
        + "vch_clietelefono   telefono, "
        + "vch_clieemail      email "
        + "from Usuario "
        + "where vch_cliepaterno like ? "
        + "and vch_cliematerno like ? "
        + "and vch_clienombre like ?";
    Object[] args = {bean.getPaterno(), bean.getMaterno(), bean.getNombre()};
    lista = jdbcTemplate.query(sql, args, new BeanPropertyRowMapper(UsuarioBean.class));*/
    return lista;
  }

  //@Transactional(propagation = Propagation.REQUIRES_NEW, 
  //    rollbackFor = Exception.class)
  @Override
  public void insertar(UsuarioBean bean) {
    // Leer contador
    /*String sql = "select int_contitem, int_contlongitud "
        + "from contador "
        + "where vch_conttabla='Usuario' "
        + "for update ";
    Map<String,Object> datos;
    datos = jdbcTemplate.queryForMap(sql);
    int cont = Integer.parseInt(datos.get("int_contitem").toString());
    int longitud = Integer.parseInt(datos.get("int_contlongitud").toString());
    String patron = "";
    for(int i = 1; i <= longitud; i++){
      patron += "0";
    }
    DecimalFormat df = new DecimalFormat(patron);
    cont++;
    String codigo = df.format(cont);
    // Actualizar el contador
    sql = "update contador set int_contitem=? "
        + "where vch_conttabla='Usuario'";
    Object[] args = {cont};
    jdbcTemplate.update(sql, args);
    // Insertar Usuario
    sql = "insert into Usuario(chr_cliecodigo,vch_cliepaterno,"
        + "vch_cliematerno,vch_clienombre,chr_cliedni,"
        + "vch_clieciudad,vch_cliedireccion,vch_clietelefono,"
        + "vch_clieemail) values(?,?,?,?,?,?,?,?,?)";
    args = new Object[]{codigo,bean.getPaterno(),bean.getMaterno(),
        bean.getNombre(),bean.getDni(),bean.getCiudad(),
        bean.getDireccion(),bean.getTelefono(),bean.getEmail()};
    jdbcTemplate.update(sql, args);
    bean.setCodigo(codigo);*/
  }

  
  @Override
  public void actualizar(UsuarioBean bean) {
    
    
  }

  @Override
  public void eliminar(String codigo) {
    // TODO Auto-generated method stub
    
  }
  public UsuarioBean validar(String usuario, String clave) {
	    UsuarioBean bean = null;
	    try {
	      String sql = "select "
	          + "cod_usu usuCodigo, "
	          + "nombre usuNombre, "
	          + "ape_pate usuApePate, "
	          + "ape_mate usuApeMate, "
	          + "telefono usuTelefono, "
	          + "usu_perf_cod usuPerfilCodigo, "
	          + "correo usuCorreo, "
	          + "pass usuPassword "
	          + "from tmUsuario "
	          + "where cod_usu = ? "
	          + "and pass = ?";
	      Object[] args = {usuario, clave};
	      bean = jdbcTemplate.queryForObject(sql, args, new BeanPropertyRowMapper(UsuarioBean.class));
	    } catch (EmptyResultDataAccessException e) {
	      bean = null;
	    }
	    return bean;
	  }

}


