package org.formation.spring.service;

import org.formation.spring.components.Driver;
import org.formation.spring.components.Motor;

public class Vehicle {

	private String brand;
	private String model;
	private Motor motor;
	private Driver driver;

	public Vehicle() {
	}

	public Vehicle(Motor motor, Driver driver) {
		this.motor = motor;
		this.driver = driver;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void go() {
		System.out.print("The " + this.brand + " " + this.model + " is going ");
		driver.drivingStyle();
		System.out.print("The sound the car makes is: ");
		motor.makeSound();
	}

}
