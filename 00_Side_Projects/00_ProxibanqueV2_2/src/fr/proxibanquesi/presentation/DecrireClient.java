package fr.proxibanquesi.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.proxibanquesi.model.*;
import fr.proxibanquesi.service.*;

/**
 * Servlet implementation class DecrireClient
 */
@WebServlet("/DecrireClient")
public class DecrireClient extends HttpServlet {
	
	private PBService pbs = new PBServiceImp();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DecrireClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idClient = Integer.parseInt(request.getParameter("idClient"));
		Client client = pbs.obtenirClient(idClient);
		CompteCourant compteCourant = pbs.obtenirCompteCourant(idClient);
		CompteEpargne compteEpargne = pbs.obtenirCompteEpargne(idClient);
		
		request.setAttribute("client", client);
		request.setAttribute("compteCourant", compteCourant);
		request.setAttribute("compteEpargne", compteEpargne);

		RequestDispatcher dispatcher = request.getRequestDispatcher("decrireclient.jsp");
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
