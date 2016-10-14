import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class SecondServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		// TODO Auto-generated method stub
		
			try{

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			HttpSession session=request.getSession(false);
			String fstname=(String)session.getAttribute("fname");
			

			
			String lstName=request.getParameter("lastName");
			out.print("Name is  "+fstname+"  "+lstName);
			
			
			session.setAttribute("lname",lstName);
			
			

			
					
			out.close();

	                }catch(Exception e){System.out.println(e);}
		
	}

}
