package model;

public class Car {
	
	private String model;
	private String owner;
	
	public String getModel() {
		return this.model;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String toString() {
		return this.getOwner()
				+ " owns a "
				+ this.getModel()
				+ ".";
	}
	
}