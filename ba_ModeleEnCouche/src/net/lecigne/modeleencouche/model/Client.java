package net.lecigne.modeleencouche.model;

public class Client {

	private String name;
	private int id;

	// *** CONSTRUCTORS ***

	public Client(String name) {
		this.name = name;
	}

	public Client() {
	}

	// *** GETTERS and SETTERS ***

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
	
}