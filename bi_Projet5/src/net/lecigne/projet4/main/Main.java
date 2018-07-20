package net.lecigne.projet4.main;

import net.lecigne.projet4.metier.Client;
import net.lecigne.projet4.dao.DaoClient;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DaoClient dao = new DaoClient();
        
        Client client1 = new Client("Amazon", "10 rue de la Source", 44000, "Nantes", "0203040506");
        
//        dao.insert(client1);
//        dao.update(7, "2 rue de la Source");
//        dao.delete(7);
        System.out.println(dao.selectIdByName("cd pro"));
        System.out.println(dao.selectIdByName("carrefour"));
        System.out.println(dao.selectAll());
        
   
    }
    
}
