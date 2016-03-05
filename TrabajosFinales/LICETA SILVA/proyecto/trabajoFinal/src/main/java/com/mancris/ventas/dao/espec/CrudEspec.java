package com.mancris.ventas.dao.espec;

import java.util.List;

public interface CrudEspec <T>{

  T traerPorCodigo(String codigo);
  
  List<T> traerPorNombre(T bean);
  
  void insertar(T bean);
  
  void actualizar(T bean);
  
  void eliminar(String codigo);
  
}


