package fr.proxibanquesi.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.proxibanquesi.model.Client;
import fr.proxibanquesi.model.Compte;
import fr.proxibanquesi.service.ClientService;
import fr.proxibanquesi.service.ClientServiceImp;
import fr.proxibanquesi.service.CompteService;
import fr.proxibanquesi.service.CompteServiceImp;

/**
 * Servlet implementation class DecrireClient
 */
@WebServlet("/DecrireClient")
public class DecrireClient extends HttpServlet {
	
	private ClientService clientService = new ClientServiceImp();
	private CompteService compteService = new CompteServiceImp();
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
		Client client = clientService.obtenirClient(idClient);
		Compte compte = compteService.obtenirCompte(idClient);
		
		request.setAttribute("client", client);
		request.setAttribute("compte", compte);

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
