package pe.veli.eurekabank.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;


import pe.veli.eurekabank.model.ClienteBean;
import pe.veli.eurekabank.service.ClienteService;
import pe.veli.eurekabank.service.EmpleadoService;



@Controller
public class EurekaController {

	@Autowired
	private EmpleadoService eurekaService;
	
	@Autowired
	private HomeController homeController;

	@Autowired
	private ClienteService clienteService;

	
	
	@RequestMapping(value = "conEmpleados.html", method = RequestMethod.GET)
	public String conEmpleados() {
		return "consultarEmpleados";
	}

	@RequestMapping(value = "conEmpleados.html", method = RequestMethod.POST)
	public ModelAndView conEmpleados(@RequestParam("paterno") String paterno) {
		ModelAndView model = new ModelAndView("consultarEmpleados");
		model.addObject("paterno", paterno);
		model.addObject("lista", eurekaService.traerEmpleado(paterno));
		return model;
	}
	
	
	@RequestMapping(value = "clienteconsultar.htm", method = RequestMethod.GET)
	public String conClientes() {
		return "conClientes";
	}
	@RequestMapping(value="clienteconsultar.htm", method=RequestMethod.POST)
	public String clienteConsultar(
	    @ModelAttribute ClienteBean clienteBean,
	    Model model){
	  model.addAttribute("lista", clienteService.getClientes(clienteBean));
	  return "conclientes2";
	}
	
	 @RequestMapping(value = "insCliente.htm", method = RequestMethod.GET)
	  public String insCliente() {
	    return "insCliente";
	  }

	  @RequestMapping(value = "insCliente.htm", method = RequestMethod.POST)
	  public String insCliente(
	      @ModelAttribute ClienteBean clienteBean, Model model) {
	    try {
	      clienteService.insertar(clienteBean);
	      
	      model.addAttribute("mensaje", "El usuario:"+ clienteBean.getPaterno() +  "Codigo:"  
	          + clienteBean.getCodigo()+ " se creó correctamente");
	    } catch (Exception e) {
	      model.addAttribute("mensaje", e.getMessage());
	    }
	    return "insCliente2";
	  }
	
}
