package pe.egcc.mvc01.controller;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pe.egcc.mvc01.service.MateService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private MateService mateServive;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("profesor", "Gustavo Coronel" );
		
		return "home";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "sumar.htm", method = RequestMethod.GET)
	public String sumar(Locale locale, Model model) {
		return "sumaForm";
	}
	
	@RequestMapping(value = "sumar.htm", method = RequestMethod.POST)
	public String sumar(HttpServletRequest request, Model model) {
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		int suma = mateServive.sumar(n1,n2);
		//int suma = n1+n2;
		model.addAttribute("n1",n1);
		model.addAttribute("n2",n2);
		model.addAttribute("suma",suma);
		return "sumaRpta";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "promediar.htm", method = RequestMethod.GET)
	public String promedio(Locale locale, Model model) {
		return "promedioForm";
	}
	
	@RequestMapping(value = "promediar.htm", method = RequestMethod.POST)
	public ModelAndView promedio(
		@RequestParam("num1") int n1,
		@RequestParam("num2") int n2,
		@RequestParam("num3") int n3,
		@RequestParam("num4") int n4) {
		// Datos
		int[] datos = {n1,n2,n3,n4};
		// Proceso
		Arrays.sort(datos);
		int menor = datos[0];
		int promedio = (datos[1]+datos[2]+datos[3])/3;
		// Reporte
		ModelAndView view = new ModelAndView("promedioRpta");
		view.addObject("datos", datos);
		view.addObject("menor", menor);
		view.addObject("promedio", promedio);
		return view;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "tabla.htm", method = RequestMethod.GET)
	public String tabla(Locale locale, Model model) {
		return "tablaForm";
	}
	
	@RequestMapping(value = "tabla5.htm", method = RequestMethod.POST)
	public ModelAndView promedio(
		@RequestParam("num1") int n1) {
		// Datos
		String valor ="";
		for (int i=0; i<12; i++) {
			
			valor = valor + String.valueOf(i) + "X" + String.valueOf(n1) + "="+ String.valueOf(i*n1)+ "<br/>";
		}
		// Proceso
		ModelAndView view = new ModelAndView("tablaRpta");
		view.addObject("resultado", valor);
		
		return view;
	}
}
