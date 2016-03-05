package com.mancris.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mancris.ventas.dao.espec.CrudUsuarioEspec;
import com.mancris.ventas.domain.UsuarioBean;
//import pe.egcc.eurekaapp.util.EurekaUtil;

@Service
public class UsuarioService {

  @Autowired
  private CrudUsuarioEspec crudUsuario;
  
  
  public UsuarioBean traerUsuario(String codigo){
    return crudUsuario.traerPorCodigo(codigo);
  }
  
  public List<UsuarioBean> traerUsuarios(UsuarioBean UsuarioBean){
    /*UsuarioBean.setPaterno(UsuarioBean.getPaterno() + "%");
    UsuarioBean.setMaterno(UsuarioBean.getMaterno() + "%");
    UsuarioBean.setNombre(UsuarioBean.getNombre() + "%");*/
    return crudUsuario.traerPorNombre(UsuarioBean);    
  }

  public void procesar(UsuarioBean UsuarioBean) {
    /*if(UsuarioBean.getAccion().equals(EurekaUtil.CRUD_NUEVO)){
      crudUsuario.insertar(UsuarioBean);
    } else if(UsuarioBean.getAccion().equals(EurekaUtil.CRUD_EDITAR)){
      crudUsuario.actualizar(UsuarioBean);
    } else if(UsuarioBean.getAccion().equals(EurekaUtil.CRUD_ELIMINAR)){
      crudUsuario.eliminar(UsuarioBean.getCodigo());*/
    }
  
  }
