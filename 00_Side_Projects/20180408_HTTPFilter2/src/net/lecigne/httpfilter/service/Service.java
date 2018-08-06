package net.lecigne.httpfilter.service;

import net.lecigne.httpfilter.model.User;

public interface Service {

	void createUser(User user);

	User getUserByAuth(String login, String pwd);

}