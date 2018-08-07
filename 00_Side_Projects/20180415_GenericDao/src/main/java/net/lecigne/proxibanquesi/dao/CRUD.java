package net.lecigne.proxibanquesi.dao;

public interface CRUD<T> {

	void creer(T t);

	T obtenir(long id);
	
	void modifier(T t);

}
