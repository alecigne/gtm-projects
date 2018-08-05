package org.formation.spring.service;

import org.formation.spring.components.Driver;
import org.formation.spring.components.Motor;

public class Vehicle {

	private Motor motor;
	private Driver driver;

	public void go() {
		System.out.print("The car is going ");
		driver.drivingStyle();
		System.out.print("The sound the car makes is: ");
		motor.makeSound();
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
