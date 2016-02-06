package pe.egcc.demo10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
    AnnotationConfigApplicationContext ctx;
    ctx = new AnnotationConfigApplicationContext(AppContext.class); 
        
    // Acceder al bean - Caso 3
    MateService mateService;
    mateService = ctx.getBean(MateService.class);
    
    // Prueba
    System.out.println("5 + 7 = " + mateService.sumar(5, 7));
    
  }
  
}
