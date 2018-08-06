package net.lecigne.httpfilter.dao;

import net.lecigne.httpfilter.model.User;

public interface UserDao {

	void createUser(User user);
	
	User getUserByLogin(String login);
	
}
