package ref.spring.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ref.spring.persistence.DAO;
import ref.spring.persistence.DAOImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context-persistence.xml" })
@Transactional
public class Persistence {

	@Autowired
	private ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		new EmbeddedDatabaseBuilder().build();
	}

	@Test
	public void persist() {

		DAO dao = context.getBean(DAOImpl.class);

		assertNotNull(dao);

		assertTrue(dao.count() == 6);

	}

}
