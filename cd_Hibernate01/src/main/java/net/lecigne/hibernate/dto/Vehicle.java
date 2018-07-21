package net.lecigne.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE) // Création d'une table de génération d'ID
	int vehicleId;
	String vehicleName;

	public Vehicle() {
	}
	
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}
