package org.formation.patternsusage.test;

import org.formation.patternsusage.dao.InMemoryBookDao;
import org.formation.patternsusage.model.Book;

public class Student {

	public static void main(String[] args) {
		InMemoryBookDao dao = new InMemoryBookDao();
		// dao
		Book book = new Book();
		// call setters
		dao.create(book);
		// dao - storage
		book.setTitle("Updated");
		dao.update(book);
		// dao - storage
		dao.delete(book);
		// dao - storage
	}

}
