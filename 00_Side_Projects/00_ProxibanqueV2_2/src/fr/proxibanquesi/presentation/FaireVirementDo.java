package fr.proxibanquesi.presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.proxibanquesi.service.PBService;
import fr.proxibanquesi.service.PBServiceImp;

/**
 * Servlet implementation class FaireVirementDo
 */
@WebServlet("/FaireVirementDo")
public class FaireVirementDo extends HttpServlet {

	private PBService pbs = new PBServiceImp();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FaireVirementDo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		int idClientSrc = Integer.valueOf(request.getParameter("idClientSrc"));
		int idClientDest = Integer.valueOf(request.getParameter("idClientDest"));
		double montant = Double.valueOf(request.getParameter("montantVirement"));

		RequestDispatcher rd;

		if (idClientSrc == idClientDest) {
			rd = request.getRequestDispatcher("/WEB-INF/errors/erreurvirement.jsp");
			rd.forward(request, response);
		} else {
			pbs.faireVirement(idClientSrc, idClientDest, montant);
			out.println("Virement effectué.");
		}

	}

}
