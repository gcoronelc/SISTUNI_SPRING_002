package pe.egcc.mvc01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.egcc.mvc01.service.ProductoService;

@Controller
@RequestMapping(value="/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String todos(Model model){
		model.addAttribute("lista", productoService.getAll());
		return "prodTodos";
	}
	
	@RequestMapping(value="/{idProd}",method=RequestMethod.GET)
	public String traerUno(@PathVariable("idProd") int idProd, Model model){
		model.addAttribute("bean", productoService.get(idProd));
		return "prodBean";
	}

	@RequestMapping(value="/grabar")
	public String grabar(){
		
		return "";
	}
}
