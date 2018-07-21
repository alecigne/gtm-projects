package net.lecigne.onetomany.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long professorId;
	private String name;

	// Classe non propriétaire de la relation (inverse end) ; toujours côté One dans un OneToMany
	// On crée les étudiants quand ils sont associés au prof grâce au CascadeType.PERSIST
	@OneToMany(mappedBy = "professor", cascade = { CascadeType.PERSIST })
	private Set<Student> students = new HashSet<>();

	public Professor() {
	}

	public Professor(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
		student.setProfessor(this);
	}

}
