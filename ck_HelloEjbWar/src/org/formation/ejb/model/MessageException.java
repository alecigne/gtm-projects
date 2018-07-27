package org.formation.ejb.model;

public class MessageException extends Exception {

	private String string;
	
	public MessageException(String string) {
		this.string = string;
	}
	
}
