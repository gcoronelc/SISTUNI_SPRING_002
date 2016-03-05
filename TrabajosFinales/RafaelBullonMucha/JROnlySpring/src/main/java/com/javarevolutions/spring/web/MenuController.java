package com.javarevolutions.spring.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/welcome.jr")
    public String redirect() {
    
        return "welcome";
    }
}
