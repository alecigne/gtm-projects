package net.lecigne.proxibanquesi.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.lecigne.proxibanquesi.model.Client;
import net.lecigne.proxibanquesi.model.Conseiller;
import net.lecigne.proxibanquesi.service.ClientService;
import net.lecigne.proxibanquesi.service.ClientServiceImp;

/**
 * Servlet implementation class ListerClients
 */
@WebServlet("/ListerClients")
public class ListerClients extends HttpServlet {
	
	private ClientService clientService = new ClientServiceImp();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListerClients() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		Conseiller conseiller = (Conseiller) session.getAttribute("conseillerSession");
		int idConseiller = conseiller.getId();
		
		List<Client> clientsConseiller = clientService.obtenirClientsConseiller(idConseiller);
		
		request.setAttribute("clientsConseiller", clientsConseiller);

		RequestDispatcher dispatcher = request.getRequestDispatcher("gestionclients.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
