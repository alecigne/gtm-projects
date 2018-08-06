package net.lecigne.httpfilter.tests;

import net.lecigne.httpfilter.model.User;
import net.lecigne.httpfilter.service.Service;
import net.lecigne.httpfilter.service.ServiceImp;

public class Test1 {

	public static void main(String[] args) {
		
		Service s = new ServiceImp();
		
		User user = s.getUserByAuth("mdupont", "1235");
		
		System.out.println(user);
		
	}

}
