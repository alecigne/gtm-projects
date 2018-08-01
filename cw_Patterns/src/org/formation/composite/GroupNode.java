package org.formation.composite;

import java.util.ArrayList;
import java.util.List;

public class GroupNode implements CompositeNode {
	
	private List<CompositeNode> nodes = new ArrayList<>();
	private static String indent = new String();
	
	public void add(CompositeNode node) {
		nodes.add(node);
	}
	
	public void remove(CompositeNode node) {
		nodes.remove(node);
	}
	
	public void empty() {
		nodes.clear();
	}

	@Override
	public void draw() {
		System.out.println("Group node");
		indent += "\t";
		for (CompositeNode node : nodes) {
			System.out.print(indent);
			node.draw();
		}
	}

}
