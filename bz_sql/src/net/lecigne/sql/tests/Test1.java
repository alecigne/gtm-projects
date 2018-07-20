package net.lecigne.sql.tests;

import net.lecigne.sql.dao.*;

public class Test1 {

	public static void main(String[] args) {

		StudentDao dao = new StudentDaoImp();
		String grade = dao.getStudentGrade("ssn", "1");
		
		System.out.println(grade);

	}

}
