package pe.egcc.mvc01.controller;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

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
	private MateService mateService;

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

		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("profesor", "Gustavo Coronel");
		return "home";
	}

	@RequestMapping(value = "sumar.htm", method = RequestMethod.GET)
	public String sumar() {
		return "sumaForm";
	}

	@RequestMapping(value = "sumar.htm", method = RequestMethod.POST)
	public String sumar(HttpServletRequest request, Model model) {
		// Datos
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		// Proceso
		int suma = mateService.sumar(n1, n2);
		// Reporte
		model.addAttribute("n1", n1);
		model.addAttribute("n2", n2);
		model.addAttribute("suma", suma);
		return "sumaRpta";
	}

	@RequestMapping(value = "promediar.htm", method = RequestMethod.GET)
	public String promedio() {
		return "promForm";
	}

	@RequestMapping(value = "promediar.htm", method = RequestMethod.POST)
	public ModelAndView promedio(
			@RequestParam("num1") int n1, 
			@RequestParam("num2") int n2,
			@RequestParam("num3") int n3, 
			@RequestParam("num4") int n4) {
		// Datos
		int[] datos = { n1, n2, n3, n4 };
		// Proceso
		Arrays.sort(datos);
		int menor = datos[0];
		int prom = (datos[1] + datos[2] + datos[3])/3;
		// Reporte
		ModelAndView view = new ModelAndView("promRpta");
		view.addObject("datos", datos);
		view.addObject("menor", menor);
		view.addObject("prom", prom);
		return view;
	}
	
	@RequestMapping(value = "tabla.htm", method = RequestMethod.POST)
	public ModelAndView TablaNum(
			@RequestParam("num1") int n1
	) {
		// Datos
		int numero=n1;
		int[] datos=new int[11] ;
		
		for(int i=0;i<datos.length;i++){
			
			datos[i]=numero*i;
			
		}
		
		
		// Proceso

		
		// Reporte
		ModelAndView view = new ModelAndView("FormTablaRpta");
		view.addObject("datos", datos);	
		return view;
	}
	
	@RequestMapping(value = "tabla.htm", method = RequestMethod.GET)
	public String TablaNum() {
		return "FormTabla";
	}

}
