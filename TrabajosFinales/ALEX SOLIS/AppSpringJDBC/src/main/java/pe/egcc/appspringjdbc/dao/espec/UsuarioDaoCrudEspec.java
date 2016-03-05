package pe.egcc.appspringjdbc.dao.espec;

import java.util.List;

import pe.egcc.appspringjdbc.domain.UsuarioBean;

public interface UsuarioDaoCrudEspec extends DaoCrudEspec<UsuarioBean>{

	UsuarioBean getForUsuarioClave(String usuario, String clave);
  
  
}
