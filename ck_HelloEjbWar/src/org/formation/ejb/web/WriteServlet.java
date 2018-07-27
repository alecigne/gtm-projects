package org.formation.ejb.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.formation.ejb.model.MessageException;
import org.formation.ejb.model.ModelEJB;

/**
 * Servlet implementation class WriteServlet
 */
@WebServlet("/WriteServlet")
public class WriteServlet extends HttpServlet {
	
	@EJB
	private ModelEJB helloEJB;
	private static String PUT_MESSAGE = "put_message";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String message = request.getParameter(PUT_MESSAGE);
		if ("".equals(message)) {
			helloEJB.deleteMessage();
		} else {
			try {
				helloEJB.putUserMessage(message);
			} catch (final MessageException nme) {
				throw new ServletException(nme);
			}
		}
		response.sendRedirect("./DisplayServlet");
	}

}
