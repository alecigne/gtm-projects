package org.formation.tests;

import org.formation.dao.BookDao;
import org.formation.patternusage.factory.Factory;
import org.formation.patternusage.factory.FactoryImp;

public class Test2 {

	public static void main(String[] args) {

		Factory factory = new FactoryImp();
		BookDao dao = factory.createDao();
		
		System.out.println(dao.getClass().getName());
		
//		Book book = new Book();
//		book.setIsbn("5678");
//
//		dao.create(book);
//		book.setTitle("Updated");
//		dao.update(book);
//
//		for (Book currentBook : dao.findAllBooks()) {
//			System.out.println(currentBook);
//		}

	}

}
