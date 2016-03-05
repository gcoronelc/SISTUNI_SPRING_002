package com.mancris.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mancris.ventas.dao.espec.CrudUsuarioEspec;
import com.mancris.ventas.domain.UsuarioBean;

@Service
public class LogonService {

  @Autowired
  private CrudUsuarioEspec crudUsuario;
  
  public UsuarioBean validar(String usuario, String clave){
    if(usuario == null || usuario.isEmpty()){
      throw new RuntimeException("Faltan datos.");
    }
    if(clave == null || clave.isEmpty()){
      throw new RuntimeException("Faltan datos.");
    }

    UsuarioBean bean = crudUsuario.validar(usuario, clave);
    if(bean == null){
      throw new RuntimeException("Datos incorrectos.");
    }
    return bean;
  }
  
  
}
