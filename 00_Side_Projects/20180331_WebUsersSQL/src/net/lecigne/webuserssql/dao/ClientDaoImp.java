package net.lecigne.webuserssql.dao;

import java.sql.*;
import java.util.List;

import net.lecigne.webuserssql.model.Client;

/**
 * Cette classe implémente l'interface IClientDAO, liée à la persistance des
 * données client, pour une base de données SQL. Elle contient des méthodes
 * permettant de réaliser le CRUD sur une table SQL.
 * 
 * @author Anthony Le Cigne
 *
 */

public class ClientDaoImp extends DaoJDBC implements ClientDao {

	// *** CREATION ***

	@Override
	public void creerClient(Client client) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cnx = this.getConnection();
			String sql = "insert into `client` (`nom`, `prenom`, `adresse`, `codepostal`, `ville`,"
					+ " `telephone`) VALUES (?, ?, ?, ?, ?, ?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, client.getNom());
			pstmt.setString(2, client.getPrenom());
			pstmt.setString(3, client.getAdresse());
			pstmt.setString(4, client.getCodePostal());
			pstmt.setString(5, client.getVille());
			pstmt.setString(6, client.getTelephone());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
	}

	// *** LECTURE ***

	@Override
	public Client obtenirClient(int id) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Client client = null;
		try {
			cnx = this.getConnection();
			String sql = "select * from client where id = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, 1);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String nom = rs.getString(1);
				String prenom = rs.getString(2);
				String adresse = rs.getString(3);
				String codePostal = rs.getString(4);
				String ville = rs.getString(5);
				String telephone = rs.getString(6);
				client = new Client(nom, prenom, adresse, codePostal, ville, telephone);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
		return client;
	}

	@Override
	public List<Client> obtenirTousClients() {
		// TODO Auto-generated method stub
		return null;
	}

	// *** MODIFICATION ***

	@Override
	public void modifierClient(int id) {
		// TODO Auto-generated method stub

	}

	// *** SUPPRESSION ***

	@Override
	public void supprimerClient(int id) {
		// TODO Auto-generated method stub

	}

}
