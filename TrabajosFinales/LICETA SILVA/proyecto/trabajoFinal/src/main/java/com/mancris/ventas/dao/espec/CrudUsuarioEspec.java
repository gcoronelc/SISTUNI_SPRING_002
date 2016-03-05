package com.mancris.ventas.dao.espec;

import com.mancris.ventas.domain.UsuarioBean;

public interface CrudUsuarioEspec extends CrudEspec<UsuarioBean>{
	public UsuarioBean validar(String usuario, String clave);

}


