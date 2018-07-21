package net.lecigne.onetomany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "professor_id")
	private Professor professor;

	public Student() {
	}

	public Student(String name) {
		this.name = name;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", professor=" + professor + "]";
//	}

}
