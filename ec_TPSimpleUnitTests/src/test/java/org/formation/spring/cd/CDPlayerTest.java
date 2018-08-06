package org.formation.spring.cd;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// Contexte de Spring
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = org.formation.spring.config.CDPlayerConfig.class)
public class CDPlayerTest {
	
	@Autowired
	private MediaPlayer player;
	
	@Test
	public void play() {
		assertNotNull(player);
		assertTrue(player.play());
	}

}
