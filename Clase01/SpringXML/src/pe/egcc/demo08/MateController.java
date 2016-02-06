package pe.egcc.demo08;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 06/02/2016
 */
@Named
public class MateController {

  @Inject
  private MateService mateService;

  public int sumar(int n1, int n2) {
    return mateService.sumar(n1, n2);
  }

}
