package net.lecigne.butterflies.model;

import java.util.ArrayList;

import net.lecigne.butterflies.service.CollectionStrategy;

/**
 * This class (a POJO) describes a butterfly collector who can adopt different
 * butterfly-collecting strategies, as per the Strategy pattern.
 * 
 * @author Anthony Le Cigne
 * @version 0.0.1
 *
 */

public class Collector {

	private String name;
	private CollectionStrategy strategy;
	
	public Collector(String name) {
		this.name = name;
	}
	
	public Collector() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CollectionStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(CollectionStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void collect(ArrayList<Butterfly> butterflies) {
		strategy.collect(butterflies);
	}

	@Override
	public String toString() {
		return "Collector [name=" + name + ", strategy=" + strategy + "]";
	}
	
}
