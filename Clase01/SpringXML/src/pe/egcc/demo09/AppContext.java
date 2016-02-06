package pe.egcc.demo09;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   06/02/2016
 */
@Configuration
public class AppContext {

  @Bean
  public MateService getMateService(){
    return new MateService();
  }
  
}
