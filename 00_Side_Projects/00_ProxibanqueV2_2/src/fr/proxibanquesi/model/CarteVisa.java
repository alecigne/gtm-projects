package fr.proxibanquesi.model;

/**
 * Cette classe abstraite factorise les caractéristiques d'une carte bancaire
 * ProxiBanque.
 * 
 * @author Joumard Sébastien, Le Cigne Anthony
 *
 */

public abstract class CarteVisa {

	// *** ATTRIBUTES ***
	
	private String numero;

	// *** GETTERS and SETTERS ***
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	// *** OTHER METHODS ***
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[numero=" + numero + "]";
	}

}
