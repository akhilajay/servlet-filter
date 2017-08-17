/**
 * 
 */
package com.akhil.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author akhil ajay
 *
 */
public class ResponseTimeFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
	PrintWriter out = res.getWriter();
	
	long before = System.currentTimeMillis();
	chain.doFilter(req, res);
	long after = System.currentTimeMillis();
	out.print("</br> Total response Time is "+(after-before)+" Milli seconde");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	
		
	}

}
