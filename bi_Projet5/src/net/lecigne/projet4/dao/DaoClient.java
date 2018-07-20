package net.lecigne.projet4.dao;

import java.sql.*;
import java.util.ArrayList;
import net.lecigne.projet4.metier.Client;
import net.lecigne.projet4.util.Bdd;

public class DaoClient {

	public void insert(Client client) {
		Connection cnx = Bdd.SeConnecter();
		try {
			String s = "insert into client (idclient, raisonsociale, adresse, codepostal, ville, telephone) "
					+ "values (seqclient.nextval, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = cnx.prepareStatement(s);
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

	public void update(int id, String adresse) {
		Connection cnx = Bdd.SeConnecter();
		try {
			String s = "update client set adresse = ? where idclient = ?";
			PreparedStatement pstmt = cnx.prepareStatement(s);
			pstmt.setString(1, adresse);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			Bdd.SeDeconnecter(cnx);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Bdd.SeDeconnecter(cnx);
		}
	}

	public void delete(int id) {
		Connection cnx = Bdd.SeConnecter();
		try {
			String s = "delete from client where idclient = ?";
			PreparedStatement pstmt = cnx.prepareStatement(s);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Bdd.SeDeconnecter(cnx);
		}
	}

	public ArrayList<Client> selectAll() {
		Connection cnx = Bdd.SeConnecter();
		ArrayList<Client> clients = new ArrayList<>();
		try {
			Statement stmt = cnx.createStatement();
			String s = "select * from client";
			ResultSet rs = stmt.executeQuery(s);

			while (rs.next()) {
				String raisonsociale = rs.getString(2);
				String adresse = rs.getString(3);
				int codePostal = rs.getInt(4);
				String ville = rs.getString(5);
				String telephone = rs.getString(6);

				Client client = new Client(raisonsociale, adresse, codePostal, ville, telephone);

				clients.add(client);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Bdd.SeDeconnecter(cnx);
		}
		return clients;
	}

	public int selectIdByName(String name) {
		int id = -1;
		Connection cnx = Bdd.SeConnecter();
		try {
			Statement stmt = cnx.createStatement();
			String sql = "select idclient from client where lower(raisonsociale) = lower('%s')";
			sql = String.format(sql, name);
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			id = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Bdd.SeDeconnecter(cnx);
		}
		return id;
	}

}
