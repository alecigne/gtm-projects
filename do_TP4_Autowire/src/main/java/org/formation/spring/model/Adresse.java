package org.formation.spring.model;

public class Adresse {

	private int numero;
	private String rue;
	private String ville;

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", ville=" + ville + "]";
	}

}
