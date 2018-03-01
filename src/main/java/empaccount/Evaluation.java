package empaccount;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.trms.beans.Employee;
import com.revature.trms.service.EmployeeService;

/**
 * Servlet implementation class Evaluation
 */
public class Evaluation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/XML");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String EmpId=((Employee) session.getAttribute("employee")).getEmpId();
	    String prgId=request.getParameter("prgEval");
		String gradeType=request.getParameter("gradeType");
		//Part afile=request.getParameter("afile");
		String message= request.getParameter("message");
		if (EmployeeService.gradeUpdate(EmpId,prgId,gradeType,message))
			 out.println("<root><req>request submitted</req></root>");
		 else out.print("<root><req>Submition failed</req></root>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
