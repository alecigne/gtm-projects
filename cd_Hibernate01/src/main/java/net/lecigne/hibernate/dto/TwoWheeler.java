package net.lecigne.hibernate.dto;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {

	String steeringHandle;

	public TwoWheeler() {
	}
	
	public TwoWheeler(String vehicleName) {
		super(vehicleName);
	}

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

}
