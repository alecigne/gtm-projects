package fr.proxibanquesi.presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.proxibanquesi.model.*;
import fr.proxibanquesi.service.*;

/**
 * Servlet implementation class AssocierCompte
 */
@WebServlet("/AssocierCompteEpargne")
public class AssocierCompteEpargne extends HttpServlet {
	
	private PBService pbs = new PBServiceImp();
	private static final long serialVersionUID = 1L;
	private RequestDispatcher rd = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssocierCompteEpargne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();

		int idClient = Integer.parseInt(request.getParameter("idClient"));
		CompteEpargne compteEpargne = pbs.obtenirCompteEpargne(idClient);

		if (compteEpargne != null) {
			out.println("Ce client possède déjà un compte épargne !");
		} else {
			pbs.associerCompteEpargne(idClient);
			compteEpargne = pbs.obtenirCompteEpargne(idClient);
			request.setAttribute("compteEpargne", compteEpargne);
			rd = request.getRequestDispatcher("/WEB-INF/results/compteepargneassocie.jsp");
			rd.forward(request, response);
//			out.println("Compte épargne associé.");
		}
		
//		Compte compte = compteService.obtenirCompte(idClient);

//		
//    	if (compte != null) {
//    		out.println("Ce client possède déjà un compte !");
//    	} else {
//    		compteService.associerCompte(idClient);
//    		response.sendRedirect("index.html");
//    	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
