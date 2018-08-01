package org.formation.patternusage.factory;

import org.formation.dao.BookDao;

public abstract class Factory {

	public abstract BookDao createDao();
	
}
