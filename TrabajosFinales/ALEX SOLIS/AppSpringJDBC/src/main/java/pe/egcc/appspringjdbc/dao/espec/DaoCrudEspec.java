package pe.egcc.appspringjdbc.dao.espec;

import java.util.List;

public interface DaoCrudEspec<T> {

  T getForID(String codigo);
  
  List<T> getForCriterio(T bean);
  
  void insertar(T bean);
  
  void actualizar(T bean);
  
  void eliminar(String codigo);
  
  
}
