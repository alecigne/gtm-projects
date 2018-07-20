package net.lecigne.simpleinterface.dao;

import java.util.ArrayList;

public class MemoryDao implements Dao {

	private static final ArrayList<String> list = new ArrayList<>();

	@Override
	public String findById(int id) {
		return list.get(id);
	}

	@Override
	public void create(String s) {
		list.add(s);
	}

	@Override
	public ArrayList<String> getList() {
		return list;
	}

}