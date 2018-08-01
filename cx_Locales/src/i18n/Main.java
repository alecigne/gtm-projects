package i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		
		// Charge tous les fichiers properties du package i18n
		ResourceBundle bundle = ResourceBundle.getBundle("i18n.libelles", Locale.CANADA_FRENCH);
		
		// Essaie de récupérer le texte associé à la clé "greeting"
		String greeting = bundle.getString("greeting");
		
		String nom = "Rabbit";
		String prenom = "Roger";
		
		greeting = MessageFormat.format(greeting, prenom, nom);
		
		System.out.println(greeting);
	
	}

}
