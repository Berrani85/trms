package loginui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetUser
 */
public class GetUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/xml");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		
		String myXml;
		
		if (!session.isNew()) {
			
			myXml= "<root>" + "<user>" + (String)session.getAttribute("username")+"</user></root>";
			out.print(myXml);
		}else{
			out.print("<root><user>the session is new</user></root>"); //State == 4
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
