package spring.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.formation.spring.springjpa.dao.UserManager;
import org.formation.spring.springjpa.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:application-context-persistence.xml"})
@Transactional
public class TestJPAPersistence {
	
	@Autowired
	private ApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		new EmbeddedDatabaseBuilder().build();
	}
	
	@Test
	public void testInsertUser() {
		User user = new User("mdupont", "1234", true);
		UserManager userManager = context.getBean(UserManager.class);
		Assert.assertNotNull(userManager);
		Assert.assertTrue(userManager.insertUser(user));
	}
	
	@Test
	public void testInsertUserByIdUser() {
		UserManager userManager = context.getBean(UserManager.class);
		Assert.assertNotNull(userManager);
		Assert.assertTrue(userManager.insertUserByIdUser("mdupont", "1234", true));
	}
	
	@Test
	public void testQueryFindByIdUser() {
		int idUser = 1;
		UserManager userManager = context.getBean(UserManager.class);
		Assert.assertNotNull(userManager);
		User user = userManager.queryFindByIdUser(idUser);
		Assert.assertNotNull(user);
		Assert.assertEquals(idUser, user.getIdUser());
	}
	
	@Test
	public void testQueryFindAllUsersJPA() {
		UserManager userManager = context.getBean(UserManager.class);
		Assert.assertNotNull(userManager);
		List<User> users = userManager.queryFindAllUsersJPA();
		Assert.assertNotNull(users);
	}
	
	@Test
	public void testDeleteUserByIdUser() {
		UserManager userManager = context.getBean(UserManager.class);
		Assert.assertNotNull(userManager);
		Assert.assertTrue(userManager.deleteUserByIdUser(1));
		Assert.assertTrue(userManager.queryFindByIdUser(1) == null);
	}
	
	@Test
	public void testQueryCountAllUsersJPA() {
		UserManager userManager = context.getBean(UserManager.class);
		Assert.assertNotNull(userManager);
		long count = userManager.queryCountAllUsersJPA();
		assertEquals(6, count);
	}

}
