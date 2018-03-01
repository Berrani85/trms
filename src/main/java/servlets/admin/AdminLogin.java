package servlets.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.trms.dao.AdminDaoService;
import com.revature.trms.service.AdminService;
import com.revature.trms.service.EmployeeService;

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    String username = request.getParameter("username");
		    String password = request.getParameter("password");
		    PrintWriter out= response.getWriter();
	     	HttpSession session=request.getSession();
		    String a=request.getParameter("admin");
		    switch (a) {
            case "1":
            	try {
        			if (AdminService.authenticationBC(username, password)!=null) {
        				session.setAttribute("username", username);
        		        response.sendRedirect("adminlogin/admin.html");
        				
        			}else session.invalidate();
        		} catch (SQLException e) {
        			
        			out.println("<p>"+e.getMessage()+"</p>");
        		}
            	break;
            case "2":
            	try {
        			if (AdminService.authenticationDH(username, password)!=null) {
        				session.setAttribute("username", username);
        		        response.sendRedirect("adminlogin/admin.html");
        				
        			}else session.invalidate();
        		} catch (SQLException e) {
        			
        			out.println("<p>"+e.getMessage()+"</p>");
        		}
            	
            	break;
            case "3":
            	try {
        			if (AdminService.authenticationMa(username, password)!=null) {
        				session.setAttribute("username", username);
        		        response.sendRedirect("adminlogin/admin.html");
        				
        			}else session.invalidate();
        		} catch (SQLException e) {
        			
        			out.println("<p>"+e.getMessage()+"</p>");
        		}
            	break;
            default:
            		out.println("whaaaaaat");
            	
            }
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
