package com.mancris.ventas.service;

import java.util.List;

import com.mancris.ventas.domain.Contact;

public interface ContactService {

	public void guardarContacto(Contact contact);

	public void eliminarContacto(int contactId);

	public Contact obtenerContacto(int contactId);

	public List<Contact> listarContactos();
  
}
