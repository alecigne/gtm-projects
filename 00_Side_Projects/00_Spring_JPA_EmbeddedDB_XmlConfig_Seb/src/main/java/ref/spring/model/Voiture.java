package ref.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "VOITURE")
public class Voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Column(name = "MODEL")
	private String model;

	@Column(name = "KM")
	private long km;

	// *** Constructors ***
	public Voiture() {
	}

	public Voiture(String model, long kilometrage) {
		this.model = model;
		this.km = kilometrage;
	}

	public Voiture(int id, String model, long km) {
		this.id = id;
		this.model = model;
		this.km = km;
	}

	// *** Getters & Setters ***

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getKm() {
		return km;
	}

	public void setKm(long km) {
		this.km = km;
	}

	// *** Methods ***
	@Override
	public String toString() {
		return "Voiture : " + model + "(" + km + "km)";
	}
}
