package com.javarevolutions.spring.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FilterWeb implements Filter {
    private FilterConfig filterConfig;
    /**
     * Default constructor. 
     */
    public FilterWeb() {
        if(filterConfig == null) {
            System.out.println("El Filtro se debe de inicializar . . .");
        }
    }

    /**
     * @see Filter#destroy()
     */
    public void destroy() {
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
            HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse resp = (HttpServletResponse)response;
        HttpSession session = req.getSession();
        resp.setHeader("Cache-Control", "no-cache");
        Object userInSession = session.getAttribute("userInSession");
        if(userInSession == null || userInSession.equals(null)) {
            req.getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        chain.doFilter(request, response);
    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
        this.filterConfig = fConfig;
    }
}
