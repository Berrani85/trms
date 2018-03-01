package empaccount;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NewRequest
 */
public class NewRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		out.println(
					"<table border=1px>"	+
							"<tr><th>ParamName</th><th>ParamValue</th></tr>"
				);
		String paramName;
		String paramValue;
		Enumeration e = request.getParameterNames();
		while(e.hasMoreElements()){
			paramName = (String)e.nextElement();
			paramValue = request.getParameter(paramName);
			
			
			
			out.println("<tr><td>" + paramName + "</td><td>" + paramValue + "</td></tr>");
			System.out.println(paramName);
		}
		out.println("</table>");
	}    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
