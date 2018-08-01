package org.formation.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private int value;

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unRegister(Observer o) {
		System.out.println(o + " gone");
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}

}
