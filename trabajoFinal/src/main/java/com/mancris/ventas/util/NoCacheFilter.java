package com.mancris.ventas.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;



public class NoCacheFilter  implements Filter{

    //private static final Logger LOG = Logger.getLogger(NoCacheFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//System.out.println("initLocal");
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		try{
			HttpServletResponse hsr = (HttpServletResponse) res;
			hsr.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			hsr.setHeader("Pragma", "no-cache");
			hsr.setDateHeader("Expires", 0);
			chain.doFilter(req, res);
		}
		catch(Exception e){
		}
	}

	@Override
	public void destroy() {
		//System.out.println("destroyLocal");
		
	}
}
