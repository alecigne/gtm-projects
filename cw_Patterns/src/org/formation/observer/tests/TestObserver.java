package org.formation.observer.tests;

import java.util.concurrent.TimeUnit;

import org.formation.observer.ConcreteObserver;
import org.formation.observer.ConcreteSubject;
import org.formation.observer.Observer;

public class TestObserver {

	public static void main(String[] args) {
		
		ConcreteSubject s = new ConcreteSubject();
		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();
		Observer o3 = new ConcreteObserver();
		
		s.register(o1);
		s.register(o2);
		s.register(o3);
		
		for (int i = 0; i < 10; i++) {
			s.setValue(i);
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
