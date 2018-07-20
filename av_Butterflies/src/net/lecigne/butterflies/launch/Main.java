package net.lecigne.butterflies.launch;

import java.util.ArrayList;

import net.lecigne.butterflies.model.*;
import net.lecigne.butterflies.presentation.CLI;
import net.lecigne.butterflies.service.CollectionStrategy;

/**
 * This class contains the main method, entry point of the entire program.
 * 
 * @author Anthony Le Cigne
 * @version 0.0.1
 * 
 */

public class Main {

	public static void main(String[] args) {

		Collector c1 = CLI.promptInfo();
		ArrayList<Butterfly> pap = CLI.promptButterflies();
		CollectionStrategy cs = CLI.promptStrategy();
		
		c1.setStrategy(cs);
		c1.collect(pap);

	}

}