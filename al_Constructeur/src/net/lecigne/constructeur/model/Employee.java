package net.lecigne.constructeur.model;

public class Employee extends Person {
	
	// *** ATTRIBUTES ***
	
	private String job;
	private double salary;
	
	// *** CONSTRUCTORS ***
	
	public Employee(String firstName, String lastName, String job, double salary) {
		super(firstName, lastName);
		this.job = job;
		this.salary = salary;
	}
	
	public Employee() {
		this("Employee", "Lambda", "Menial job", 0);
	}
	
	// *** ACCESSORS ***

	public double getSalary() {
		return this.salary;
	}

	// *** MUTATORS ***
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// *** OTHER METHODS ***
	
	public String toString() {
		String str = super.toString();
		str = str
				+ " His salary is "
				+ this.salary
				+ ".";
		return str;
	}

}
