package org.formation.composite;

public class LeafNodeButton implements CompositeNode {

	@Override
	public void draw() {
		System.out.println("Draw button");
	}

}
