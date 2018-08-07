package net.lecigne.angularclient.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.lecigne.angularclient.config.SpringConfig;
import net.lecigne.angularclient.model.Client;
import net.lecigne.angularclient.service.AppService;
import net.lecigne.angularclient.service.AppServiceImp;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		AppService service = context.getBean("service", AppServiceImp.class);
		Client c1 = new Client("Michel", "Dupont");
		service.creerClient(c1);
	}

}
