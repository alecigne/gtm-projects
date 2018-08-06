package org.formation.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

// Remplace le web.xml
public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// injection
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		
		// Chargement d'une classe de configuration (idem Spring mais orienté Web)
		rootContext.register(WebConfig.class);
		
		servletContext.addListener(new ContextLoaderListener(rootContext));
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(rootContext);
		
		ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
		
		// On charge tout de suite la Servlet de dispatch
		registration.setLoadOnStartup(1);
		// Redirection de toutes les requêtes vers la Servlet de dispatch
		registration.addMapping("/");
		
	}

}
