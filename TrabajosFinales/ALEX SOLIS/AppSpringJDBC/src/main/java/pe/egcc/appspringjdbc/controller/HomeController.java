package pe.egcc.appspringjdbc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.egcc.appspringjdbc.domain.UsuarioBean;
import pe.egcc.appspringjdbc.service.UsuarioService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UsuarioService usuarioService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		System.out.println("verr"+"cehckalo");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home1";
	}
	
	@RequestMapping(value = "home0.htm", method = RequestMethod.GET)
	public String home0() {
		System.out.println("uuuuu");
		return "home";
	}
	
	@RequestMapping(value = "home1.htm", method = RequestMethod.GET)
	public String home() {
		System.out.println("ffffff");
		return "home1";
	}
	
	@RequestMapping(value = "home1.htm", method = RequestMethod.POST)
	public String home(@ModelAttribute UsuarioBean ub, Model model) {
		
		UsuarioBean bean = usuarioService.getUsuario(ub.getUsuario(), ub.getClave());
		if(bean == null){
			return "home2";
		}
		
		System.out.println("verr"+ "home - POST: "+bean);
		System.out.println("verr"+ ub.getUsuario());
		model.addAttribute("usuario", ub.getUsuario() );
		
		return "home";
	}
	
}
