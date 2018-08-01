package org.formation.builder.tests;

import org.formation.builder.ComplexObject;

public class TestComplexObject {

	public static void main(String[] args) {

		ComplexObject complexObject = new ComplexObject.ComplexObjectBuilder("name", "codename")
				.setAuto(true)
				.setBig(true)
				.setNumber(45)
				.build();
	}

}
