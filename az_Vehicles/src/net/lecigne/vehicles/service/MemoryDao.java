package net.lecigne.vehicles.service;

import java.util.ArrayList;

public class MemoryDao<T> implements Dao<T> {

	@Override
	public void save(T element, ArrayList<T> al) {
		al.add(element);
	}

}