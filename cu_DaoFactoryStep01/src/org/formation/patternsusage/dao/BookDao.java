package org.formation.patternsusage.dao;

import java.util.Collection;

import org.formation.patternsusage.model.Book;

public interface BookDao {

	// storage:
	// core responsibility
	Collection<Book> findAllBooks();

	//
	Book findBookByIsbn(String isbn);

	void create(Book book);

	void delete(Book book);

	void update(Book book);

}