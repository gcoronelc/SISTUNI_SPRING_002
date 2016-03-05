package pe.veli.eurekabank.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import pe.veli.eurekabank.dao.espec.EmpleadoDaoEspec;
import pe.veli.eurekabank.model.ClienteBean;
import pe.veli.eurekabank.model.EmpleadoBean;
import pe.veli.eurekabank.service.ClienteService;
import pe.veli.eurekabank.service.EmpleadoService;
import pe.veli.eurekabank.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private LoginService loginService;
		
	private EmpleadoBean empleado;
	
	public EmpleadoBean getEmpleado() {
		return empleado;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "loadPage.htm")
	public String loadPage(@RequestParam("page") String page) {
		return page;
	}

	@RequestMapping(value = "login.html", method = RequestMethod.POST)
	public ModelAndView logon(@RequestParam("usuario") String usuario, @RequestParam("clave") String clave,
			HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		try {
			EmpleadoBean bean = loginService.validar(usuario, clave);
			empleado = bean;
			request.getSession().setAttribute("usuario", bean);
			model.setViewName("main2");
		} catch (Exception e) {
			model.setViewName("home");
			model.addObject("mensaje", e.getMessage());
		}
		return model;
	}
	

	
	
}
