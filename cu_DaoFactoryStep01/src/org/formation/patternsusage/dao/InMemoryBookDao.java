package org.formation.patternsusage.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.formation.patternsusage.model.Book;

public class InMemoryBookDao implements BookDao{
	private static Map<String, Book> bookstore = new HashMap<String, Book>();

	// storage:
	// core responsibility
	@Override
	public Collection<Book> findAllBooks() {
		return bookstore.values();
	}

	//
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
		// no operation - for an in-memory
		// database,
		// we update automatically in real time
	}
}
