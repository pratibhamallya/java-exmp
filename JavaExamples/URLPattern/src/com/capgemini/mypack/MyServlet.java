package com.capgemini.mypack;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
 @WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("from constructor");
        
    }
public void init(){
	System.out.println("init without parameters");
}
public void init(ServletConfig config){
	System.out.println("init with Config parameters");
}
public void service(ServletRequest request, 
        ServletResponse response) 
throws ServletException, IOException{
	System.out.println("generic servlet service method");
	destroy();
}
public void service(HttpServletRequest request, 
		HttpServletResponse response) 
throws ServletException, IOException{
	System.out.println("http servlet service method");
}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	 public void destroy() {
		 System.out.println("destroy method called");
		  }
}
