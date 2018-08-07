package ref.spring.persistence;

import ref.spring.model.Voiture;

public interface DAO {

	public void add(Voiture voiture);
	
	public int count();

}
