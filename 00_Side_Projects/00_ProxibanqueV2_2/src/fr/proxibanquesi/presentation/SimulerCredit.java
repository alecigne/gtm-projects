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
 * Servlet implementation class SimulerCredit
 */
@WebServlet("/SimulerCredit")
public class SimulerCredit extends HttpServlet {

	PBService pbs = new PBServiceImp();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SimulerCredit() {
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

		RequestDispatcher rd;

		double montant = Double.valueOf(request.getParameter("montant"));
		int duree = Integer.valueOf(request.getParameter("duree"));
		double taux = Integer.valueOf(request.getParameter("taux"));

		double mensualite = pbs.simulerCredit(montant, duree, taux);

		request.setAttribute("mensualite", mensualite);

		rd = request.getRequestDispatcher("/WEB-INF/results/simulationcredit.jsp");
		rd.forward(request, response);

	}

}
