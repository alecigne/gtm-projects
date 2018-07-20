package net.lecigne.projet4.dao;

import java.sql.*;
import net.lecigne.projet4.metier.Client;
import net.lecigne.projet4.util.Bdd;

public class DaoClient2 {
	
	public void insert(Client client) {
		Connection cnx = Bdd.SeConnecter();
		try {
			String sql = "insert into client (idclient, raisonsociale, adresse, codepostal, ville, telephone)"
					+ " values (seqclient.nextval, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, client.getRaisonSociale());
			pstmt.setString(2, client.getAdresse());
			pstmt.setInt(3, client.getCodePostal());
			pstmt.setString(4, client.getVille());
			pstmt.setString(5, client.getTelephone());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Bdd.SeDeconnecter(cnx);
		}
	}

}
