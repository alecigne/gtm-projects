package org.formation.builder;

public class ComplexObject2 {

	private String name;
	private String codename;
	private boolean isBig;
	private boolean isAuto;
	private int number;

	public ComplexObject2(String name, String codeName) { // Paramètres obligatoires
		this.name = name;
		this.codename = codeName;
	}

	public ComplexObject2 setBig(boolean isBig) {
		this.isBig = isBig;
		return this;
	}

	public ComplexObject2 setAuto(boolean isAuto) {
		this.isAuto = isAuto;
		return this;
	}

	public ComplexObject2 setNumber(int number) {
		this.number = number;
		return this;
	}

}
