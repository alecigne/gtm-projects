package net.lecigne.httpfilter.presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.lecigne.httpfilter.model.User;
import net.lecigne.httpfilter.service.Service;
import net.lecigne.httpfilter.service.ServiceImp;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	private Service s = new ServiceImp();
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
		String loginInput = request.getParameter("login");
		String passwordInput = request.getParameter("password");
		PrintWriter out = response.getWriter();

		User user = s.getUserByAuth(loginInput, passwordInput);

		if (user != null) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(30 * 60);
			session.setAttribute("userSession", user);
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		} else {
			out.println("Authentication failed.");
		}
	}

}
