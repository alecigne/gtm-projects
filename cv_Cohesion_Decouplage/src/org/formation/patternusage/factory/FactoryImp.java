package org.formation.patternusage.factory;

import org.formation.dao.BookDao;
import org.formation.dao.InMemoryBookDao;
import org.formation.dao.OracleBookDao;
import org.formation.patternusage.util.MyUtil;

public class FactoryImp extends Factory {

	@Override
	public BookDao createDao() {
		if (MyUtil.INSTANCE.getEnvironment() != null && MyUtil.INSTANCE.getEnvironment().equals(MyUtil.PROD)) {
			return new OracleBookDao();
		} else {
			return new InMemoryBookDao();
		}
	}

}
