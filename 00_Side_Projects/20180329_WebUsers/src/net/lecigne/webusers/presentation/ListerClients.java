package net.lecigne.webusers.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.lecigne.webusers.model.Client;
import net.lecigne.webusers.service.*;

/**
 * Servlet implementation class ListerClients
 */
@WebServlet("/ListerClients")
public class ListerClients extends HttpServlet {
	
	private Service s = new ServiceImp();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListerClients() {
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

		List<Client> allClients = s.obtenirListeClients();
		
		HttpSession session = request.getSession();
		session.setAttribute("allClients", allClients);

		// sendRedirect method
		
		response.sendRedirect("allclients.jsp");
		
	}

}
