package org.formation.observer;

public class ConcreteObserver implements Observer {

	@Override
	public void update(int v) {
		System.out.println("Observer received new value: " + v);
	}

}
