package ref.spring.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ref.spring.config.Config;
import ref.spring.model.Adresse;
import ref.spring.model.Client;
import ref.spring.persistence.DAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class })
public class Launch {

	@Autowired
	private DAO dao;

	private static Logger LOGGER = LoggerFactory.getLogger(Launch.class);

	@Test
	public void test() {

		assertNotNull(dao);

		LOGGER.warn(" *** LISTE CLIENT *** : " + dao.findAll().toString());

		LOGGER.warn(" *** CLIENT PAR ID *** : " + dao.findClientById(2).toString());

		LOGGER.warn(" *** LISTE CLIENT PAR NOM *** : " + dao.findAllClientByNom("Lyonnais").toString());

		LOGGER.warn(" *** CLIENT UNIQUE PAR NOM *** : " + dao.findClientByNom("Lyonnais").toString());

		LOGGER.warn(" *** LISTE CLIENT PAR VILLE *** : " + dao.findAllClientByAdresseVille("Paris").toString());
	}
}
