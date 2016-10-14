import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class FirstServlet extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response){
		try{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("firstName");
		out.print("Welcome "+n);
		
		HttpSession session=request.getSession();
		session.setAttribute("fname",n);
		out.print("<htm><body>");
		out.print("<form action='servlet2'>");
		out.print("LastName:<input type='text' name='lastName'/><br/>");
		out.print("<input type='submit' value='go'/>");
		out.print("</form></body></html>");
		
		

		
				
		out.close();

                }catch(Exception e){System.out.println(e);}
	}


}
