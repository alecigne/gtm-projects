package net.lecigne.manytomany.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;

	@ManyToMany(mappedBy = "actors")
	private Set<Movie> movies = new HashSet<>();

	public Actor() {
	}

	public Actor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	public void addMovie(Movie movie) {
		this.movies.add(movie);
		movie.getActors().add(this);
	}
	
	public void removeMovie(Movie movie) {
		this.movies.remove(movie);
		movie.getActors().remove(this);
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + "]";
	}

}
