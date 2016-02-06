package pe.egcc.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   06/02/2016
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    // Crear el contexto
    String ctxFile = "/pe/egcc/demo02/contexto.xml";
    ApplicationContext ctx;
    ctx = new ClassPathXmlApplicationContext(ctxFile); 
       
    // Acceder al bean
    MateController mateController;
    mateController = ctx.getBean(MateController.class);
    
    // Prueba
    System.out.println("5 + 7 = " + mateController.sumar(5, 7));
    System.out.println("Nombre = " + mateController.getNombre());
    
  }
  
}
