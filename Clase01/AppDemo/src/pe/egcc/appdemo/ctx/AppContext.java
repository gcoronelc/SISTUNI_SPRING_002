package pe.egcc.appdemo.ctx;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   06/02/2016
 */
@Configuration
@ComponentScan({"pe.egcc.appdemo.service","pe.egcc.appdemo.controller"})
public class AppContext {

}
