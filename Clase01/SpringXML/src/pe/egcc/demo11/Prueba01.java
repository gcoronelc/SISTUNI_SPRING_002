package pe.egcc.demo11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 06/02/2016
 */
public class Prueba01 {

  public static void main(String[] args) {

    // Crear el contexto
    AnnotationConfigApplicationContext ctx;
    ctx = new AnnotationConfigApplicationContext(AppContext.class);

    // Acceder al bean
    MateController mateController;
    mateController = ctx.getBean(MateController.class);

    // Prueba
    System.out.println("5 + 7 = " + mateController.sumar(5, 7));

  }

}
