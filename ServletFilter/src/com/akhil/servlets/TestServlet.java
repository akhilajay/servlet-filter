/**
 * 
 */
package com.akhil.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * @author akhil ajay
 *
 */
public class TestServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1502351538963165017L;

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("in servelt -->"+req.getRequestURI());
	}

}
