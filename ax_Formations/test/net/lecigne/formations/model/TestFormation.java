package net.lecigne.formations.model;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.*;

class TestFormation {

	Manager m;
	DemandeFormation d1;

	@BeforeEach
	void firstInit() {
		d1 = new DemandeFormation("01-01-2018", "31-01-2018");
	}

	@Test
	void managerAutoValidatesFormation() {
		m = new Manager(0, "Michel", "Dupont");
		m.demanderFormation(d1);
		assertTrue(DemandeFormation.ACCORDE.equals(d1.getEtatValidation()));
	}

	@Test
	void employeDoesntValidateFormation() {
		Employe e = new Employe(0, "Jacques", "Durant");
		DemandeFormation d = new DemandeFormation("01-03-2015", "01-04-2015");
		e.demanderFormation(d);
		assertTrue(DemandeFormation.ATTENTE.equals(d.getEtatValidation()));
	}

}