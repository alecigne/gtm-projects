package net.lecigne.vehicles.service;

import java.util.ArrayList;

public interface Dao<T> {

	void save(T element, ArrayList<T> al);
	
}
