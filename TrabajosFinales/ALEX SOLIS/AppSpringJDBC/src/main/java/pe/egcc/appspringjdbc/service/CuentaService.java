package pe.egcc.appspringjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.egcc.appspringjdbc.dao.espec.CuentaDaoEspec;

@Service
public class CuentaService {

  @Autowired
  private CuentaDaoEspec cuentaDao;
  
  public Double getSaldo(String cuenta){
    return cuentaDao.getSaldo(cuenta);
  }
  
}
