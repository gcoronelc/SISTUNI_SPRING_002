package com.javarevolutions.spring.dao.iface;

import java.util.List;

import com.javarevolutions.spring.entity.Index;

public interface IndexDAO {
	public boolean validaLogin(Index entity) throws Exception;
	public boolean insertaUsuario(Index entity) throws Exception;
	public boolean borraUsuario(Index entity) throws Exception;
	public boolean actualizaUsuario(Index entity) throws Exception;
	public List<Index> consultaUsuarios() throws Exception;
	public Index getUsuarioPorId(Index entity) throws Exception;
}
