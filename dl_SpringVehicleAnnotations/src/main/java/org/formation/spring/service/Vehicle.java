package org.formation.spring.service;

import org.formation.spring.components.Driver;
import org.formation.spring.components.Motor;

public class Vehicle {

	private Motor motor;
	private Driver driver;

	public Vehicle() {
	}

	public Vehicle(Motor motor, Driver driver) {
		this.motor = motor;
		this.driver = driver;
	}

	public void go() {
		System.out.print("The car is going ");
		driver.drivingStyle();
		System.out.print("The sound the car makes is: ");
		motor.makeSound();
	}

}
