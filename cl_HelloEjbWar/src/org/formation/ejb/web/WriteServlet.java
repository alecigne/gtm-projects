package org.formation.ejb.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.formation.ejb.MessageException;
import org.formation.ejb.ModelEJB;


@WebServlet(name = "WriteServlet", urlPatterns = {"/WriteServlet"})
public class WriteServlet extends HttpServlet {
    @EJB
    private ModelEJB helloEJB;
    private static String PUT_MESSAGE = "put_message";

    
    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
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