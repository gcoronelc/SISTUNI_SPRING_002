package pe.egcc.demo07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 06/02/2016
 */
@Controller
public class MateController {

  @Autowired
  private MateService mateService;

  public int sumar(int n1, int n2) {
    return mateService.sumar(n1, n2);
  }

}
