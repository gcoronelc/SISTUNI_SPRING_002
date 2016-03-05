package pe.egcc.appspringjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.egcc.appspringjdbc.dao.espec.ClienteDaoEspec;
import pe.egcc.appspringjdbc.dao.espec.UsuarioDaoCrudEspec;
import pe.egcc.appspringjdbc.dao.espec.UsuarioDaoEspec;
import pe.egcc.appspringjdbc.domain.ClienteBean;
import pe.egcc.appspringjdbc.domain.UsuarioBean;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioDaoCrudEspec usuarioDao;
  
  public UsuarioBean getUsuario(String usuario, String clave){
    return usuarioDao.getForUsuarioClave(usuario, clave);
  }

  public void insUsuario(UsuarioBean bean){
	usuarioDao.insertar(bean);
 }
  
  public List<UsuarioBean> getUsuarios(UsuarioBean bean){
		return usuarioDao.getForCriterio(bean);
	 }
  
  public void delUsuario(String id){
		usuarioDao.eliminar(id);
	 }
  
}
