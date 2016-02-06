package pe.egcc.demo03;

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
  private String email;

  public MateController(MateService mateService, String nombre, String email) {
    this.mateService = mateService;
    this.nombre = nombre;
    this.email = email;
  }

  public String getNombre() {
    return nombre;
  }

  public String getEmail() {
    return email;
  }

  public int sumar(int n1, int n2) {
    return mateService.sumar(n1, n2);
  }

}
