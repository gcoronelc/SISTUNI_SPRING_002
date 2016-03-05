package pe.egcc.appspringjdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import pe.egcc.appspringjdbc.domain.ClienteBean;
import pe.egcc.appspringjdbc.domain.UsuarioBean;
import pe.egcc.appspringjdbc.service.ClienteService;
import pe.egcc.appspringjdbc.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;


  @RequestMapping(value = "home3.htm", method = RequestMethod.GET)
  public String insUsuario() {
    return "home3";
  }

  @RequestMapping(value = "home3.htm", method = RequestMethod.POST)
  public String insUsuario(
      @ModelAttribute UsuarioBean bean, Model model) {
    try {
      usuarioService.insUsuario(bean);
      model.addAttribute("mensaje", "Usuario Registrado Correctamente. ");
      model.addAttribute("usuario", bean.getUsuario()); 
      model.addAttribute("clave", bean.getClave());
    } catch (Exception e) {
      model.addAttribute("mensaje", e.getMessage());
    }
    return "home3";
  }
  
  @RequestMapping(value = "home4.htm", method = RequestMethod.GET)
  public String getUsuarios(
      @ModelAttribute UsuarioBean bean, Model model) {
	  List<UsuarioBean> lista;
	    lista = usuarioService.getUsuarios(bean);
	    model.addAttribute("lista", lista);
	    return "home4";
  }
  
  @RequestMapping(value = "home5.htm", method = RequestMethod.GET)
  public String delUsuario(
      @ModelAttribute UsuarioBean bean, Model model) {
	  if(bean != null) {
		  System.out.println("vvvvv: "+bean.getId());
		  usuarioService.delUsuario(bean.getId().toString());
		  return getUsuarios(bean, model);
	  }
	  return "home4";
  }

}
