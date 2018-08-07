package net.lecigne.jdbc.dao;

import java.sql.*;
import net.lecigne.jdbc.domain.Client;
import net.lecigne.jdbc.util.Bdd;

public class DaoClient {

	public void insert(Client client) {
		Connection cnx = Bdd.seConnecter();
		String sql = "insert into client (idclient, raisonsociale, adresse, codepostal, ville, "
				+ "telephone) values (seqclient.nextval, ?, ?, ?, ?, ?)";
		try {
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
			Bdd.seDeconnecter(cnx);
		}
	}
	
	public void update(int idclient, String adresse) {
		Connection cnx = Bdd.seConnecter();
		String sql = "update client set adresse = ? where idclient = ?";
		try {
			PreparedStatement pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, adresse);
			pstmt.setInt(2, idclient);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
