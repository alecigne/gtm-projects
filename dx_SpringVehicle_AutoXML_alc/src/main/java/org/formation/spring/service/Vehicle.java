package org.formation.spring.service;

import org.formation.spring.components.Driver;
import org.formation.spring.components.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	@Value("Chevrolet")
	private String brand;
	@Value("Camaro SS")
	private String model;
	@Autowired
	private Motor motor;
	@Autowired
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
