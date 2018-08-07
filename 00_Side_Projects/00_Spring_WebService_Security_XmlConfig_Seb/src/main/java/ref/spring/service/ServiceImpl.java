package ref.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.security.access.annotation.Secured;

import ref.spring.model.Voiture;

public class ServiceImpl implements Service{

	private List<Voiture> voitureList = new ArrayList<>();
	private long id=0;
	
	
	public ServiceImpl() {
		voitureList.add(new Voiture(++id, "Bleu", "Renault"));
		voitureList.add(new Voiture(++id, "Blanc", "Citroën"));
		voitureList.add(new Voiture(++id, "Rouge", "Dacia"));
	}
	
	@Override
	public List<Voiture> selectAll() {
		System.out.println(voitureList.toString());
		return voitureList;
	}

	@Override
	public void add(Voiture voiture) {

		voiture.setId(++id);
		voitureList.add(voiture);
		System.out.println(voitureList.toString());
	}
	

}
