package net.lecigne.projet4.util;

import java.sql.*;

public class Bdd {
    
    public static Connection SeConnecter() {
        Connection cnx = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            cnx = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                    "anthony", "anthony");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return cnx;
    }
    
    public static void SeDeconnecter(Connection cnx) {
        try {
            cnx.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}