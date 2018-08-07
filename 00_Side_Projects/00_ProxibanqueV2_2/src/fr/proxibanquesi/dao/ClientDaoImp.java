package fr.proxibanquesi.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import fr.proxibanquesi.model.Client;

/**
 * Cette classe développe les méthodes des interfaces permettant de réaliser les
 * opérations du CRUD coté client
 * 
 * @author Anthony le Cigne et Jean-Michel Hiltbrunner
 *
 */
public class ClientDaoImp extends DaoJDBC implements ClientDao {

	// *** CREATION ***

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.proxibanquesi.dao.ClientDao#creerClient(fr.proxibanquesi.model.Client)
	 */
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
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
	}

	// *** LECTURE ***

	@Override
	public Client obtenirClient(int idClient) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Client client = null;
		try {
			cnx = this.getConnection();
			String sql = "select * from `client` where `idclient` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, idClient);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int idclient = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String adresse = rs.getString(4);
				String codePostal = rs.getString(5);
				String ville = rs.getString(6);
				String telephone = rs.getString(7);
				client = new Client(nom, prenom, adresse, codePostal, ville, telephone);
				client.setIdClient(idclient);
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
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Client> clients = new ArrayList<>();
		try {
			cnx = this.getConnection();
			String sql = "select * from `client`";
			pstmt = cnx.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int idClient = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String adresse = rs.getString(4);
				String codePostal = rs.getString(5);
				String ville = rs.getString(6);
				String telephone = rs.getString(7);
				Client client = new Client(nom, prenom, adresse, codePostal, ville, telephone);
				client.setIdClient(idClient);
				clients.add(client);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
		return clients;
	}

	// *** MODIFICATION ***

	@Override
	public void modifierClient(int idClient, Client client) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cnx = this.getConnection();
			String sql = "update `client` set `nom`= ?, `prenom`= ?,"
					+ " `adresse`= ?, `codePostal`= ?, `ville`= ?, `telephone`= ? where `idclient`= ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, client.getNom());
			pstmt.setString(2, client.getPrenom());
			pstmt.setString(3, client.getAdresse());
			pstmt.setString(4, client.getCodePostal());
			pstmt.setString(5, client.getVille());
			pstmt.setString(6, client.getTelephone());
			pstmt.setInt(7, idClient);
			pstmt.executeUpdate();

		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}

	}

	// *** SUPPRESSION ***

	@Override
	public void supprimerClient(int idClient) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cnx = this.getConnection();
			String sql = "delete from `client` where `idclient` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, idClient);
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
	}

}
