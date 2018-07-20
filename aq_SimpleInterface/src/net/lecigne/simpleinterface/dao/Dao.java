package net.lecigne.simpleinterface.dao;

import java.util.ArrayList;

public interface Dao {
	
	String findById(int id);
	void create(String s);
	ArrayList<String> getList();
		
}