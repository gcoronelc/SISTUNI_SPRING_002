package pe.egcc.demo01;

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
    String ctxFile = "/pe/egcc/demo01/contexto.xml";
    ApplicationContext ctx;
    ctx = new ClassPathXmlApplicationContext(ctxFile); 
    
    // Acceder al bean - Caso 1
    //MateService mateService;
    //mateService = (MateService) ctx.getBean("mateService");
    
    // Acceder al bean - Caso 2
    // MateService mateService;
    // mateService = ctx.getBean("mateService",MateService.class);
    
    // Acceder al bean - Caso 3
    MateService mateService;
    mateService = ctx.getBean(MateService.class);
    
    // Prueba
    System.out.println("5 + 7 = " + mateService.sumar(5, 7));
    
  }
  
}
