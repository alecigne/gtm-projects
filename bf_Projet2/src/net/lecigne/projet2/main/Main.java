package net.lecigne.projet2.main;

import java.sql.*;
import net.lecigne.projet2.util.Bdd;

public class Main {

    public static void main(String[] args) {
        Connection cnx = Bdd.SeConnecter();
        try {
            Statement stat = cnx.createStatement();
            String sql = "insert into client values (9, 'GTM', '2 rue Stephenson',"
                    + "'78180', 'Montigny', '0161084820', null)";
            stat.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	Bdd.SeDeconnecter(cnx);
        }
    }
    
}
