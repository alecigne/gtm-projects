package net.lecigne.jdbc.util;

import java.sql.*;

public final class Bdd {

	public static Connection seConnecter() {
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
	
	public static void seDeconnecter(Connection cnx) {
		try {
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
