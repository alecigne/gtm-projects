package net.lecigne.proxibanquesi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.lecigne.proxibanquesi.model.Client;

public class ClientDaoImp extends DaoJDBC implements ClientDao {

	public void creerClient(Client client) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		try {
			cnx = seConnecter();
			String sql = "insert into `client` (`nom`, `prenom`, `adresse`, `codepostal`, `ville`,"
					+ " `telephone`, `idconseiller`) VALUES (?, ?, ?, ?, ?, ?, ?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, client.getNom());
			pstmt.setString(2, client.getPrenom());
			pstmt.setString(3, client.getAdresse());
			pstmt.setString(4, client.getCodePostal());
			pstmt.setString(5, client.getVille());
			pstmt.setString(6, client.getTelephone());
			pstmt.setInt(7, client.getIdConseiller());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt);
		}
	}

	@Override
	public Client obtenirClient(int idClient) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Client client = null;
		try {
			cnx = seConnecter();
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
			seDeconnecter(cnx, pstmt, rs);
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
			cnx = this.seConnecter();
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
			this.seDeconnecter(cnx, pstmt, rs);
		}
		return clients;
	}

	@Override
	public List<Client> obtenirClientsConseiller(int idConseiller) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Client> clients = new ArrayList<>();
		try {
			cnx = seConnecter();
			String sql = "select * from `client` where `idconseiller` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, idConseiller);
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
				client.setIdConseiller(idConseiller);
				clients.add(client);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}
		return clients;
	}

	@Override
	public void modifierClient(int idClient, Client client) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cnx = this.seConnecter();
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
			this.seDeconnecter(cnx, pstmt, rs);
		}

	}

	@Override
	public void supprimerClient(int idClient) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cnx = this.seConnecter();
			String sql = "delete from `client` where `idclient` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, idClient);
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.seDeconnecter(cnx, pstmt, rs);
		}
	}

}
