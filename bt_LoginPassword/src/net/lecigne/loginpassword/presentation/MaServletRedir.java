package net.lecigne.loginpassword.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServletRedir
 */
@WebServlet("/MaServletRedir")
public class MaServletRedir extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String validPassword = "aimejava";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServletRedir() {
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

		String password = request.getParameter("password");

		RequestDispatcher dispatcher;

		if (validPassword.equalsIgnoreCase(password)) {
			dispatcher = request.getRequestDispatcher("accueil.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("login.html");
		}
		dispatcher.forward(request, response);
	}

}
