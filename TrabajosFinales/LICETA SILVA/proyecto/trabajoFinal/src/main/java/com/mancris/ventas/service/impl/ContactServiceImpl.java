package com.mancris.ventas.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mancris.ventas.dao.espec.ContactDAO;
import com.mancris.ventas.domain.Contact;
import com.mancris.ventas.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService  {

	@Autowired
	private ContactDAO contactDAO;
  
	public void guardarContacto(Contact contact) {
		contactDAO.saveOrUpdate(contact);
	}

	public void eliminarContacto(int contactId) {
		contactDAO.delete(contactId);
	}

	public Contact obtenerContacto(int contactId) {
		Contact contact = contactDAO.get(contactId);
		return contact;
	}

	public List<Contact> listarContactos() {
		List<Contact> listContact = (ArrayList<Contact>) contactDAO.listAll();
		return listContact;
	}
  
}
