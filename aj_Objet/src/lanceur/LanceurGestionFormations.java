package lanceur;

import domaine.*;

public class LanceurGestionFormations {

  /**
   * @param args
   */
  
  public static void main(String[] args) {

    // DONE 1) Déclaration
    Employe employe1;
    Employe employe2;
    Manager manager1;
    DemandeFormation demandeFormation1;
    
    // DONE 2) Instanciation
    employe1 = new Employe("Cox", "Alan", 1);
    employe2 = new Employe("Torvalds", "Linux", 2);
    manager1 = new Manager("Stallman", "Richard", 3);
    demandeFormation1 = new DemandeFormation("Java",
        "07/03/2018", "ATTENTE");
    
    // DONE 3) Utilisation
    employe1.demanderFormation("Spring");
    employe2.demanderFormation("Hibernate");
    manager1.demanderFormation("Git");
    
    manager1.validerFormation();

  }

}
