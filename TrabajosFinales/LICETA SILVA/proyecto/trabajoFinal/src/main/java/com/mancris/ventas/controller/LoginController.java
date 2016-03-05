package com.mancris.ventas.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mancris.ventas.domain.UsuarioBean;
import com.mancris.ventas.service.LogonService;


@Controller
public class LoginController {
	
	@Autowired
	private LogonService logonService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "login";
	}
	
	@RequestMapping(value="iniciarSesion.htm", method=RequestMethod.POST)
	public ModelAndView autenticarUsuario(HttpServletRequest request){
		
		ModelAndView view = new ModelAndView("principal");
		HttpSession session = request.getSession();

		try {
		      
		      String usuCodigo = request.getParameter("usuCodigo");
		      String usuPassword = request.getParameter("usuPassword");
		      
		      UsuarioBean bean;
		      bean = logonService.validar(usuCodigo,usuPassword);

		      session.setAttribute("UsuarioLogon", bean);
		      view.setViewName("principal");
		      
		    } catch (Exception e) {
		      
		      view.addObject("error", e.getMessage());
		      view.setViewName("login");
		    }
		
		
		return view;
	}
	
	@RequestMapping(value="home.htm", method=RequestMethod.GET)
	public ModelAndView autenticarUsuarioGet(HttpServletRequest request){
		
		ModelAndView view = new ModelAndView("principal");
		return view;
	}
	
	@RequestMapping(value="cerrarSesion.htm", method=RequestMethod.GET)
	public ModelAndView cerrarSesion(HttpServletRequest request) {
		ModelAndView view = new ModelAndView("login");
		try {
			HttpSession sesion = request.getSession();
			sesion.invalidate();
			view.setViewName("login");
		} catch (Exception e) {
			view.addObject("msj", "" + e.getMessage());
			//System.out.println("Error: " + e);
		}
		return view;
	}
	
}
