package com.mancris.ventas.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {
	
	@RequestMapping(value="usuarioNuevo.htm", method=RequestMethod.GET)
	public ModelAndView autenticarUsuario(HttpServletRequest request){
		ModelAndView view = new ModelAndView("usuarioNuevo");
		return view;
	}
}
