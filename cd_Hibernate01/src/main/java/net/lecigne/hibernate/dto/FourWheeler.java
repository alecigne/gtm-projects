package net.lecigne.hibernate.dto;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {

	String steeringWheel;

	public FourWheeler() {
	}
	
	public FourWheeler(String vehicleName) {
		super(vehicleName);
	}

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

}
