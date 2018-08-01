package org.formation.dao;

import java.util.Collection;

import org.formation.model.Book;

public class OracleBookDao implements BookDao {

	@Override
	public Collection<Book> findAllBooks() {
		System.out.println("findAllBooks");
		return null;
	}

	@Override
	public Book findBookByIsbn(String isbn) {
		System.out.println("findBookByIsbn");
		return null;
	}

	@Override
	public void create(Book book) {
		System.out.println("create");
	}

	@Override
	public void delete(Book book) {
		System.out.println("delete");
	}

	@Override
	public void update(Book book) {
		System.out.println("update");
	}

}
