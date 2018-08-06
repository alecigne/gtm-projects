package net.lecigne.httpfilter.service;

import net.lecigne.httpfilter.dao.UserDao;
import net.lecigne.httpfilter.dao.UserDaoImp;
import net.lecigne.httpfilter.model.User;

public class ServiceImp implements Service {

	private UserDao dao = new UserDaoImp();

	@Override
	public void createUser(User user) {
		if (user != null) {
			dao.createUser(user);
		}
	}

	@Override
	public User getUserByAuth(String login, String pwd) {
		User user = getUserByLogin(login);
		if (user != null && pwdIsCorrect(user, pwd)) {
			return user;
		} else {
			return null;
		}
	}
	
	// Helpers
	
	private User getUserByLogin(String login) {
		return dao.getUserByLogin(login);
	}
	
	private boolean pwdIsCorrect(User user, String pwd) {
		boolean answer = false;
		if (user.getPassword().equals(pwd)) {
			answer = true;
		}
		return answer;
	}
	


}
