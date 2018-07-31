package firstws.test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWS {
	
	@WebMethod
	public String sayHello() {
		return "Hello from WS";
	}

}
