package net.lecigne.projet1.main;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		Connection cnx = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cnx = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "anthony",
					"anthony");
			Statement stat = cnx.createStatement();
			String sql = "insert into client values (10, 'GTM', '2 rue Stephenson',"
					+ "'78180', 'Montigny', '0161084820', null)";
			stat.execute(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				cnx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
