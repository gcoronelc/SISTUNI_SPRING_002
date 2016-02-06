package pe.egcc.appdemo.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   06/02/2016
 */
@Service
public class VentaService {

  public double calcular(double precio, int cant){
    return (precio * cant);
  }
  
}
