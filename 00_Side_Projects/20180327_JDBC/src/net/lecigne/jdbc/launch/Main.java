package net.lecigne.jdbc.launch;

import net.lecigne.jdbc.dao.DaoClient;
import net.lecigne.jdbc.domain.Client;

public class Main {

	public static void main(String[] args) {

		Client client1 = new Client("GTM", "5 villa Lourcine", "Paris", 75014, "0162874951");
		DaoClient dao = new DaoClient();
		
		dao.insert(client1);
		dao.update(12, "6 villa Lourcine");
		
	}

}
