package org.formation.dao;

import java.util.Collection;

import org.formation.model.Book;

public interface BookDao {

	Collection<Book> findAllBooks();

	Book findBookByIsbn(String isbn);

	void create(Book book);

	void delete(Book book);

	void update(Book book);

}