package fr.proxibanquesi.presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.proxibanquesi.model.Compte;
import fr.proxibanquesi.service.CompteService;
import fr.proxibanquesi.service.CompteServiceImp;

/**
 * Servlet implementation class AssocierCompte
 */
@WebServlet("/AssocierCompte")
public class AssocierCompte extends HttpServlet {
	
	private CompteService compteService = new CompteServiceImp();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssocierCompte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idClient = Integer.parseInt(request.getParameter("idClient"));
		Compte compte = compteService.obtenirCompte(idClient);
		PrintWriter out = response.getWriter();
		
    	if (compte != null) {
    		out.println("Ce client possède déjà un compte !");
    	} else {
    		compteService.associerCompte(idClient);
    		response.sendRedirect("index.html");
    	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
