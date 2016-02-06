package pe.egcc.appdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.egcc.appdemo.service.VentaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   06/02/2016
 */
@Controller
public class VentaController {

  @Autowired
  private VentaService ventaService;
  
  public double calcularVenta(double precio, int cant){
    return ventaService.calcular(precio, cant);
  }
  
}
