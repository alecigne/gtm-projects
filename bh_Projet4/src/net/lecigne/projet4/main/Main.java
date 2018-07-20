package net.lecigne.projet4.main;

import java.sql.*;
import net.lecigne.projet4.util.Bdd;

public class Main {

	public static void main(String[] args) {
		Connection cnx = Bdd.SeConnecter();
		try {
			Statement stmt = cnx.createStatement();
			String s = "select * from requeteexo4";
			ResultSet rs = stmt.executeQuery(s);

			while (rs.next()) {
				String raisonsociale = rs.getString(1);
				int numcom = rs.getInt(2);
				int prix = rs.getInt(3);
				System.out.println(numcom + " " + raisonsociale + " " + prix);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Bdd.SeDeconnecter(cnx);
		}
	}

}
