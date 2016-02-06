package pe.egcc.demo08;

import javax.inject.Named;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   06/02/2016
 */
@Named
public class MateService {

  public int sumar(int n1, int n2){
    return (n1 + n2);
  }
  
}
