/**
 * 
 */
package com.akhil.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author akhil ajay
 *
 */
public class AuthenticationFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		
		String userName="test";
		String password="test123";
		
		if(request.getParameter("username").equals(userName)&& request.getParameter("password").equals(password)){
			System.out.println("testing before doFilter");
			filterChain.doFilter(request, response);
			System.out.println("testing after doFilter");
		}else{
			System.out.println("processing in else");
			RequestDispatcher rd = request.getRequestDispatcher("invalid");
			rd.include(request, response);
		}
		
		//System.out.println("testing before doFilter");
		
		//System.out.println("testing after doFilter");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
