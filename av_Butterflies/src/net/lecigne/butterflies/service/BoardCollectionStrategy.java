package net.lecigne.butterflies.service;

import java.util.ArrayList;

import net.lecigne.butterflies.model.Butterfly;

/**
 * A concrete butterfly-collecting strategy for nailed down butterflies on a
 * wooden board.
 * 
 * @author Anthony Le Cigne
 * @version 0.0.1
 *
 */

public class BoardCollectionStrategy implements CollectionStrategy {

	@Override
	public void collect(ArrayList<Butterfly> butterflies) {
		System.out.println("These butterflies:");
		for(Butterfly p : butterflies) {
			System.out.println(p);
		}
		System.out.println("...are nailed down on a board. Poor thing(s) :(");
	}

}
