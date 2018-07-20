package net.lecigne.genericite.after;

public class GPaire<T> {
	
	T premier;
	T second;
	
	public GPaire(T premier, T second) {
		this.premier = premier;
		this.second = second;
	}
	
	public T getPremier() {
		return premier;
	}

	public T getSecond() {
		return second;
	}
	
}
