package fr.proxibanque.modele;

/**
 * Cette classe abstraite factorise les caractéristiques d'une carte bancaire
 * ProxiBanque.
 * 
 * @author Anthony Le Cigne
 *
 */

public abstract class CarteVisa {

	// *** ATTRIBUTS ***
	
	private String numero;

	// *** ACCESSEURS et MUTATEURS ***
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	// *** AUTRES METHODES ***
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[numero=" + numero + "]";
	}

}
