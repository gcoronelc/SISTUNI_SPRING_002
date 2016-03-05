package com.mancris.ventas.dao.espec;

import java.util.List;

import com.mancris.ventas.domain.Contact;

/**
 * Defines DAO operations for the contact model.
 * @author german liceta
 *
 */
public interface ContactDAO extends CrudEspec<Contact> {

	public void saveOrUpdate(Contact contact);

	public void delete(int contactId);

	public Contact get(int contactId);

	public List<Contact> listAll();
}