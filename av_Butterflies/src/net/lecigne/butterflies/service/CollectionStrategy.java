package net.lecigne.butterflies.service;

import java.util.ArrayList;

import net.lecigne.butterflies.model.Butterfly;

/**
 * A butterfly collector needs a collection strategy in order to grow his/her
 * collection. This interface lists the various operations needed for creating
 * such a valid butterfly-collecting strategy.
 * 
 * @author Le Cigne
 * @version 0.0.1
 *
 */

public interface CollectionStrategy {

	void collect(ArrayList<Butterfly> butterflies);

}
