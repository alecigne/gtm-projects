package org.formation.builder.tests;

import org.formation.builder.ComplexObject2;

public class TestComplexObject2 {

	public static void main(String[] args) {
		
		ComplexObject2 co2 = new ComplexObject2("Name", "CodeName");
		
		co2.setAuto(true).setBig(false).setNumber(10);
		
	}

}
