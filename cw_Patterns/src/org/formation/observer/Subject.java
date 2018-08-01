package org.formation.observer;

// Pourrait être abstraite, avec notifyObservers déjà implémentée
public interface Subject {

	void register(Observer o);

	void unRegister(Observer o);

	void notifyObservers();

}
