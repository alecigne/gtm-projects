package net.lecigne.projet3.main;

import java.sql.*;
import net.lecigne.projet3.util.Bdd;

public class Main {

    public static void main(String[] args) {
        Connection cnx = Bdd.SeConnecter();
        try {
            String s = "update article set prixunit = ? where idarticle = ?";
            PreparedStatement pstmt = cnx.prepareStatement(s);
            pstmt.setInt(1, 200);
            pstmt.setInt(2, 1);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	Bdd.SeDeconnecter(cnx);
        }
    }
    
}
