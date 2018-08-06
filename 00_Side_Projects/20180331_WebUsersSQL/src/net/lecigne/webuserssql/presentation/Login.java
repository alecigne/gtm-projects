package net.lecigne.webuserssql.presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.lecigne.webuserssql.model.Conseiller;
import net.lecigne.webuserssql.service.ConseillerServiceImp;
import net.lecigne.webuserssql.service.IConseillerService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	private IConseillerService conseillerService = new ConseillerServiceImp();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		Conseiller conseiller = conseillerService.obtenirConseiller(login);
		
		if (conseiller != null && password.equals(conseiller.getPassword())) {
			out.print("Welcome, " + conseiller.getNom());
			HttpSession session = request.getSession();
			session.setAttribute("conseiller", conseiller);
		} else {
			out.print("Sorry, username or password error!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();

	}

}
