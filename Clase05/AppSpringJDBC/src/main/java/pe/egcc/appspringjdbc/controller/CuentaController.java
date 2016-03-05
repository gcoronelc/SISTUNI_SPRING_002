package pe.egcc.appspringjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pe.egcc.appspringjdbc.service.CuentaService;

@Controller
public class CuentaController {
  
  @Autowired
  private CuentaService cuentaService;

  /**
   * Carga el formulario.
   * 
   * @return Retorna el nombre del view
   */
  @RequestMapping(value="getSaldo.htm", method=RequestMethod.GET)
  public String getSaldo(){
    return "getSaldo";
  }
  
  /**
   * Procesa el formulario.
   * 
   * @param cuenta
   * @return
   */
  @RequestMapping(value="getSaldo.htm", method=RequestMethod.POST,
      produces="text/plain")
  @ResponseBody
  public String getSaldo(@RequestParam("cuenta") String cuenta){
    Double saldo = cuentaService.getSaldo(cuenta);
    String texto;
    if(saldo == null){
      texto = "No existe cuenta.";
    } else {
      texto = String.valueOf(saldo);
    }
    return texto;
  }
}
