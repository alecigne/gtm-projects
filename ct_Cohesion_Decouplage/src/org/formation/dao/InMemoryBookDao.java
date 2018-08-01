package org.formation.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.formation.model.Book;

public class InMemoryBookDao implements BookDao {

	private static Map<String, Book> bookstore = new HashMap<>();

	@Override
	public Collection<Book> findAllBooks() {
		return bookstore.values();
	}

	@Override
	public Book findBookByIsbn(String isbn) {
		return bookstore.get(isbn);
	}

	@Override
	public void create(Book book) {
		bookstore.put(book.getIsbn(), book);
	}

	@Override
	public void delete(Book book) {
		bookstore.remove(book.getIsbn());
	}

	@Override
	public void update(Book book) {
		this.create(book);
	}

}
