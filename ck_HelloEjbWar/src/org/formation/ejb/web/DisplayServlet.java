package org.formation.ejb.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.formation.ejb.model.MessageException;
import org.formation.ejb.model.ModelEJB;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	
	@EJB
	private ModelEJB helloEJB;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		final PrintWriter out = response.getWriter();
		try {
			out.println("<html>\r\n" + 
					"<head>\r\n" + 
					"<title>Hello Java EE</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"	<br>\r\n" + 
					"	<div align=\"center\">\r\n" + 
					"		<h2>Hello Java EE</h2>\r\n" + 
					"		Enter a message for Java EE which will pass through the web tier, the\r\n" + 
					"		EJB tier to the database, and back again!\r\n" + 
					"		<br>\r\n" + 
					"		<br>\r\n" + 
					"		<br>\r\n" + 
					"		<form action=\"./WriteServlet\" method=\"POST\">\r\n" + 
					"			<input type=\"submit\" value=\"Enter\">\r\n" + 
					"			<input type=\"text\" name=\"put_message\">\r\n" + 
					"		</form>\r\n" + 
					"		<br>");
			String displayMessage;
			try {
				final String storedMessage = helloEJB.getStoredMessage();
				displayMessage = "Hello from (" + storedMessage + "), inside a "
						+ "web component";
			} catch (final MessageException nme) {
				displayMessage = "You should enter a value...";
			}
			out.println("The current message from Java EE: <br><b>" + displayMessage + "</b>");;
			out.println("	</div>\r\n" + 
					"</body>\r\n" + 
					"</html>");
			} finally {
				out.close();
			}
	}

}
