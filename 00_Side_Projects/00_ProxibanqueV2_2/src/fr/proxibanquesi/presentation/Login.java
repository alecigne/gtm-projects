package fr.proxibanquesi.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.proxibanquesi.model.Conseiller;
import fr.proxibanquesi.service.PBService;
import fr.proxibanquesi.service.PBServiceImp;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	private PBService pbs = new PBServiceImp();
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String password = request.getParameter("password");

		Conseiller conseiller = pbs.obtenirConseiller(login);
		request.setAttribute("conseiller", conseiller);

		RequestDispatcher rd;
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(20 * 60); // Session de 20 minutes par défaut

		session.setAttribute("conseillerSession", conseiller);

		// TODO Les appels aux pages d'erreurs relatives au conseiller pourraient
		// utiliser la session
		if (conseiller == null) {
			rd = request.getRequestDispatcher("/WEB-INF/errors/logininvalide.jsp");
			rd.forward(request, response);
		} else if (password.equals(conseiller.getPassword())) {
			rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} else {
			rd = request.getRequestDispatcher("/WEB-INF/errors/pwdinvalide.jsp");
			rd.forward(request, response);
		}

	}
}
