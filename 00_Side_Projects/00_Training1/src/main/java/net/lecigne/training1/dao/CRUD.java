package net.lecigne.training1.dao;

import java.util.List;

public interface CRUD<K, T> {

	void sauvegarder(T t);

	void modifier(T t);

	T obtenir(K k);

	List<T> obtenirTous();

	void supprimer(K k);

}
