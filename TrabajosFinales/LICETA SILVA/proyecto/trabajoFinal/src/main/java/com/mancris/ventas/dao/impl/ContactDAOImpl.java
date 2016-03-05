package com.mancris.ventas.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.mancris.ventas.dao.espec.ContactDAO;
import com.mancris.ventas.domain.Contact;

/**
 * An implementation of the ContactDAO interface.
 * @author german liceta
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
@Repository
public class ContactDAOImpl extends AbstractDao implements ContactDAO {

	@Override
	public void saveOrUpdate(Contact contact) {
		if (!contact.getId().equals("")) {
			// update
			String sql = "UPDATE Contacto SET nombre=?, ape_pate=?, ape_mate=?, email=?, direccion=?, " + "telefono=? WHERE contacto_id=?";
			jdbcTemplate.update(sql, contact.getName(), contact.getApellidoPaterno(), contact.getApellidoMaterno(), contact.getEmail(), contact.getAddress(),
					contact.getTelephone(), contact.getId());
		} else {
			// Leer contador
//		    String sql_ = "select int_contitem, int_contlongitud "
//		        + "from contador "
//		        + "where vch_conttabla='Contacto' "
//		        + "for update ";
//		    Map<String,Object> datos;
//		    datos = jdbcTemplate.queryForMap(sql_);
//		    int cont = Integer.parseInt(datos.get("int_contitem").toString());
//		    int longitud = Integer.parseInt(datos.get("int_contlongitud").toString());
//		    String patron = "";
//		    for(int i = 1; i <= longitud; i++){
//		      patron += "0";
//		    }
//		    DecimalFormat df = new DecimalFormat(patron);
//		    cont++;
//		    String codigo = df.format(cont);
			 String sql_ = "select (max(contacto_id) + 1) maximo "
					 + "from Contacto ";
					 //+ "for update ";
			 Map<String,Object> datos;
			 datos = jdbcTemplate.queryForMap(sql_);
			 String codigo = "0000" + datos.get("maximo").toString();
			// insert
			String sql = "INSERT INTO Contacto (contacto_id, nombre, ape_pate, ape_mate, email, direccion, telefono)" + " VALUES (?, ?, ?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql, codigo, contact.getName(), contact.getApellidoPaterno(), contact.getApellidoMaterno(), contact.getEmail(), contact.getAddress(),
					contact.getTelephone());
		}
	}

	@Override
	public void delete(int contactId) {
		String sql = "DELETE FROM Contacto WHERE contacto_id=?";
		jdbcTemplate.update(sql, contactId);
	}

	@Override
	public List<Contact> listAll() {
		List<Contact> listContact = null;
		String sql = "select "
		        + "contacto_id     id, "
		        + "nombre    name, "
		        + "ape_pate    apellidoPaterno, "
		        + "ape_mate    apellidoMaterno, "
		        + "email        email, "
		        + "direccion     address, "
		        + "telefono  telephone "
		        + "from Contacto ";

		    try{
		    	listContact = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Contact>(Contact.class));
		      } catch(EmptyResultDataAccessException e){
		    	  listContact = null;
		      }
		    
		    for (Contact contact : listContact) {
		    	contact.setNombreCompleto(contact.getName() + " " + contact.getApellidoPaterno() + " " + contact.getApellidoMaterno());
		    }
		    
		return listContact;
	}

	public Contact get(int contactId) {
		String sql = "SELECT * FROM Contacto WHERE contacto_id=" + contactId;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Contact>() {
			@Override
			public Contact extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Contact contact = new Contact();
					contact.setId(rs.getString("contacto_id"));
					contact.setName(rs.getString("nombre"));
					contact.setApellidoPaterno(rs.getString("ape_pate"));
					contact.setApellidoMaterno(rs.getString("ape_mate"));
					contact.setEmail(rs.getString("email"));
					contact.setAddress(rs.getString("direccion"));
					contact.setTelephone(rs.getString("telefono"));
					return contact;
				}
				return null;
			}
		});
	}
	
	@Override
	  public Contact traerPorCodigo(String codigo) {
	    Contact bean = null;
	    return bean;
	  }

	  
	  @Override
	  public List<Contact> traerPorNombre(Contact bean) {
		  return null;
	  }

	  //@Transactional(propagation = Propagation.REQUIRES_NEW, 
	  //    rollbackFor = Exception.class)
	  @Override
	  public void insertar(Contact bean) {
	  }

	  
	  @Override
	  public void actualizar(Contact bean) {
	    
	    
	  }

	  @Override
	  public void eliminar(String codigo) {
	    // TODO Auto-generated method stub
	    
	  }

}