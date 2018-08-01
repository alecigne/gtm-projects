package org.formation.tests;

import org.formation.dao.BookDao;
import org.formation.dao.InMemoryBookDao;
import org.formation.model.Book;

public class Test1 {

	public static void main(String[] args) {

		BookDao dao = new InMemoryBookDao();
		
		Book book = new Book();
		book.setIsbn("5678");

		dao.create(book);
		book.setTitle("Updated");
		dao.update(book);

		for (Book currentBook : dao.findAllBooks()) {
			System.out.println(currentBook);
		}

	}

}
