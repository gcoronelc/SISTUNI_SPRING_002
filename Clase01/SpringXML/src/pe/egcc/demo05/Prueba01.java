package pe.egcc.demo05;

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
    String ctxFile = "/pe/egcc/demo05/contexto.xml";
    ApplicationContext ctx;
    ctx = new ClassPathXmlApplicationContext(ctxFile); 
       
    // Acceder al bean
    MateService mateService;
    mateService = ctx.getBean(MateService.class);
    
    // Prueba
    System.out.println("5 + 7 = " + mateService.sumar(5, 7));
    
  }
  
}
