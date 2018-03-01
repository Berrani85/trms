package loginui;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.trms.beans.Employee;
import com.revature.trms.beans.Request;
import com.revature.trms.service.EmployeeService;

/**
 * Servlet implementation class AccountView
 */
public class AccountView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		if (!session.isNew()) {
		try {
			ArrayList<Request> ar=EmployeeService.getRequests(((Employee)session.getAttribute("employee")).getEmpId());
			String myXml="<root>";
			for(Request r:ar) {    
			      myXml+="<req><reqId>"+r.getReqNum() +"</reqId>"
			      		+ "<prg>"+ r.getDescripion()+"</prg>"
			      		+ "<date>"+ r.getAppliedDate() +"</date>"
			      		+ "<supervisor>"+ r.getSupervisorApproval() +"</supervisor>"
			      		+"<dept>"+r.getDeptAproval() +"</dept>"
			      		+"<benco>"+ r.getBencoAproval() +"</benco></req>"; 
			       }
			myXml+="</root>";
			out.print(myXml);
			} catch (SQLException e) {
		      	e.printStackTrace();
		     }
		}else {
			out.print("<root><user>the session is new</user></root>"); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
