package fr.proxibanquesi.tests;

import fr.proxibanquesi.dao.*;
import fr.proxibanquesi.model.Client;
import fr.proxibanquesi.model.CompteCourant;
import fr.proxibanquesi.service.PBService;
import fr.proxibanquesi.service.PBServiceImp;

public class Test1 {

	public static void main(String[] args) {

//		CompteDao compteDao = new CompteDaoImp();
//		
//		CompteCourant cc1 = new CompteCourant(70222622, 1000.0, "2018-04-03", 4);
//		
//		compteDao.modifierCompteCourant(4, cc1);
		
		PBService pbs = new PBServiceImp();
		
		pbs.faireVirement(4, 1, 200.0);


	}

}
