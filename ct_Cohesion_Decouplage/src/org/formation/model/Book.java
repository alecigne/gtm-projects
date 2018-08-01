package org.formation.model;

//import java.util.Collection;
//import java.util.Map;

public class Book {

	// private static Map<String, Book> bookstore;
	private String isbn;
	private String title;
	private String author;

	// public Collection<Book> findAllBooks() {
	// return bookstore.values();
	// }
	//
	// public Book findBookByIsbn(String isbn) {
	// return bookstore.get(isbn);
	// }
	//
	// public void create() {
	// bookstore.put(this.isbn, this);
	// }
	//
	// public void delete() {
	// bookstore.remove(this.getIsbn());
	// }
	//
	// public void update() {
	// bookstore.put(this.isbn, this);
	// }

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}

}
