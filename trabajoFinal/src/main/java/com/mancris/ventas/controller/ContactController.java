package com.mancris.ventas.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mancris.ventas.domain.Contact;
import com.mancris.ventas.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value="contactos.htm", method=RequestMethod.GET)
	public ModelAndView autenticarUsuario(HttpServletRequest request){
		ModelAndView view = new ModelAndView("contacto/contactoPrincipal");
		List<Contact> listContact = contactService.listarContactos();
		view.addObject("listContact", listContact);
		return view;
	}
	
	@RequestMapping(value="/")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	    List<Contact> listContact = contactService.listarContactos();
	    model.addObject("listContact", listContact);
	    model.setViewName("contacto/contactoPrincipal");
	 
	    return model;
	}
	
	@RequestMapping(value = "newContact.htm", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Contact newContact = new Contact();
		model.addObject("contact", newContact);
		model.setViewName("contacto/contacto");
		return model;
	}
	
	@RequestMapping(value = "/saveContact", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Contact contact) {
		contactService.guardarContacto(contact);
		return new ModelAndView("contacto/contactoPrincipal");
	}
	
	@RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
	public ModelAndView deleteContact(HttpServletRequest request) {
		int contactId = Integer.parseInt(request.getParameter("id"));
		contactService.eliminarContacto(contactId);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/editContact", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int contactId = Integer.parseInt(request.getParameter("id"));
		Contact contact = contactService.obtenerContacto(contactId);
		ModelAndView model = new ModelAndView("contacto/contacto");
		model.addObject("contact", contact);
		return model;
	}
}
