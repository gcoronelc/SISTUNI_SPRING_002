package pe.egcc.appspringjdbc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
      produces="Application/json")
  @ResponseBody
  public Map<String, Object> getSaldo(@RequestParam("cuenta") String cuenta){
    Double saldo = cuentaService.getSaldo(cuenta);
    Map<String,Object> rec = new HashMap<String, Object>();
    rec.put("cuenta",cuenta);
    if(saldo == null){
      rec.put("saldo","NO EXISTE");
    } else {
      rec.put("saldo",saldo);
    }
    
    
    return rec;
  }
}
