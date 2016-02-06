package pe.egcc.demo02;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 06/02/2016
 */
public class MateController {

  private MateService mateService;
  private String nombre;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setMateService(MateService mateService) {
    this.mateService = mateService;
  }

  public int sumar(int n1, int n2) {
    return mateService.sumar(n1, n2);
  }

}
