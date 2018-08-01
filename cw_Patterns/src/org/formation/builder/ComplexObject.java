package org.formation.builder;

public class ComplexObject {

	private String name;
	private String codename;
	private boolean isBig;
	private boolean isAuto;
	private int number;

	public String getName() {
		return name;
	}

	public String getCodename() {
		return codename;
	}

	public boolean isBig() {
		return isBig;
	}

	public boolean isAuto() {
		return isAuto;
	}

	public int getNumber() {
		return number;
	}

	private ComplexObject(ComplexObjectBuilder complexObjectBuilder) {
		this.name = complexObjectBuilder.name;
		this.codename = complexObjectBuilder.codename;
		this.isBig = complexObjectBuilder.isBig;
		this.isAuto = complexObjectBuilder.isAuto;
		this.number = complexObjectBuilder.number;
	}

	public static class ComplexObjectBuilder {

		private String name;
		private String codename;
		private boolean isBig;
		private boolean isAuto;
		private int number;

		public ComplexObjectBuilder(String name, String codeName) { // Paramètres obligatoires
			this.name = name;
			this.codename = codeName;
		}

		public ComplexObjectBuilder setBig(boolean isBig) {
			this.isBig = isBig;
			return this;
		}

		public ComplexObjectBuilder setAuto(boolean isAuto) {
			this.isAuto = isAuto;
			return this;
		}

		public ComplexObjectBuilder setNumber(int number) {
			this.number = number;
			return this;
		}
		
		public ComplexObject build() {
			return new ComplexObject(this);
		}

	}

}
