package net.lecigne.tests.test;

import java.sql.*;

public class Test4 {

	public static void main(String[] args) {
		Connection cnx = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cnx = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
					"anthony", "anthony");
			String sql = "select * from requeteexo4";
			Statement stat = cnx.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				String raisonSociale = rs.getString(1);
				int numCom = rs.getInt(2);
				int prix = rs.getInt(3);
				System.out.println(raisonSociale + " " + numCom + " " + prix);
			}
			
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
