package fr.proxibanquesi.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.proxibanquesi.model.CompteCourant;
import fr.proxibanquesi.service.PBService;
import fr.proxibanquesi.service.PBServiceImp;

/**
 * Servlet implementation class AssocierCompte
 */
@WebServlet("/AssocierCompteCourant")
public class AssocierCompteCourant extends HttpServlet {

	private PBService pbs = new PBServiceImp();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AssocierCompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd;
		int idClient = Integer.parseInt(request.getParameter("idClient"));
		CompteCourant compteCourant = pbs.obtenirCompteCourant(idClient);

		if (compteCourant != null) {
			// Récupérer les informations du compte pour l'erreur
			request.setAttribute("compteCourant", compteCourant);
			rd = request.getRequestDispatcher("/WEB-INF/errors/erreurcomptecourant.jsp");
			rd.forward(request, response);
		} else {
			pbs.associerCompteCourant(idClient);
			// Récupérer le compte désormais créé
			compteCourant = pbs.obtenirCompteCourant(idClient);
			request.setAttribute("compteCourant", compteCourant);
			rd = request.getRequestDispatcher("/WEB-INF/results/comptecourantassocie.jsp");
			rd.forward(request, response);
		}
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
