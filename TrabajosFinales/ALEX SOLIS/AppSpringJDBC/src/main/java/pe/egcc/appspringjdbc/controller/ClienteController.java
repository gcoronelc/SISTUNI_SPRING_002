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
import pe.egcc.appspringjdbc.service.ClienteService;

@Controller
public class ClienteController {

  @Autowired
  private ClienteService clienteService;

  @RequestMapping(value = "getCliente.htm", method = RequestMethod.GET)
  public String getCliente() {
    return "getCliente";
  }

  @RequestMapping(value = "getCliente.htm", method = RequestMethod.POST, produces = "text/plain")
  //produces = "Application/json" el mismo browser convierte la cdena gson e un objeto json 
  @ResponseBody
  public String getCliente(@RequestParam("codigo") String codigo) {
    ClienteBean bean = clienteService.getCliente(codigo);
    Gson gson = new Gson();
    String textoJson = gson.toJson(bean);
//    return "getCliente";
    return textoJson;
  }

  @RequestMapping(value = "getClientes.htm", method = RequestMethod.GET)
  public String getClientes() {
    return "getClientes";
  }

  @RequestMapping(value = "getClientes.htm", method = RequestMethod.POST)
  public String getClientes(@ModelAttribute ClienteBean clienteBean, Model model) {
    List<ClienteBean> lista;
    lista = clienteService.getClientes(clienteBean);
    model.addAttribute("lista", lista);
    return "getClientes";
  }

  @RequestMapping(value = "insCliente.htm", method = RequestMethod.GET)
  public String insCliente() {
	  System.out.println("entras primero");
    return "insCliente";
  }

  @RequestMapping(value = "insCliente.htm", method = RequestMethod.POST)
  public String insCliente(
      @ModelAttribute ClienteBean clienteBean, Model model) {
	  System.out.println("entras segundo");
    try {
      clienteService.insertar(clienteBean);
      model.addAttribute("mensaje", "Todo ok. Codigo: " 
          + clienteBean.getCodigo());
    } catch (Exception e) {
      model.addAttribute("mensaje", e.getMessage());
    }
    return "insCliente";
  }

}
