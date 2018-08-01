package org.formation.composite.tests;

import org.formation.composite.CompositeNode;
import org.formation.composite.GroupNode;
import org.formation.composite.LeafNodeButton;
import org.formation.composite.LeafNodeImage;

public class TestCompositeNode {

	public static void main(String[] args) {
		
		CompositeNode button1 = new LeafNodeButton();
		CompositeNode button2 = new LeafNodeButton();
		CompositeNode image = new LeafNodeImage();
		
		GroupNode layout = new GroupNode();
		GroupNode layout2 = new GroupNode();
		
		layout.add(button1);
		
		layout2.add(button2);
		layout2.add(image);
		
		layout.add(layout2);
		
		layout.draw();
		
	}

}
