package pe.egcc.appspringjdbc.dao.impl;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import pe.egcc.appspringjdbc.dao.espec.CuentaDaoEspec;

@Repository
public class CuentaDaoImpl extends AbstractDao implements CuentaDaoEspec {

  @Override
  public Double getSaldo(String cuenta) {
    Double saldo;
    try {
      String sql = "select DEC_CUENSALDO " 
          + "from cuenta where chr_cuencodigo = ?";
      String[] args = { cuenta };
      saldo = jdbcTemplate.queryForObject(sql, args, Double.class);
    } catch (EmptyResultDataAccessException e) {
      saldo = null;
    }
    return saldo;
  }

}
