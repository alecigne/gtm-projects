package net.lecigne.mvc.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.lecigne.mvc.model.DeptPair;
import net.lecigne.mvc.service.DeptNumService;
import net.lecigne.mvc.service.NumDeptMapper;

/**
 * Servlet implementation class ShowDept
 */
@WebServlet("/ShowDept")
public class ShowDept extends HttpServlet {

	private DeptNumService dns = new NumDeptMapper();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowDept() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String deptNum = request.getParameter("numDept");

		if (deptNum == null) {
			deptNum = new String();
		} else {
			deptNum = deptNum.trim();
		}

		String deptName = dns.findDept(deptNum);

		DeptPair mapping = new DeptPair(deptNum, deptName);

//		HttpSession session = request.getSession();
//		session.setAttribute("mapping", mapping);
		
		request.setAttribute("mapping", mapping);

		String address = new String();

		if (deptNum.isEmpty()) {
			address = "/WEB-INF/results/missing.jsp";
		} else if (deptName != null) {
			address = "/WEB-INF/results/show-departement.jsp";
		} else {
			address = "/WEB-INF/results/unknown.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
