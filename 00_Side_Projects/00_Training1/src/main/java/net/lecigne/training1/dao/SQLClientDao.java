package net.lecigne.training1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.lecigne.training1.model.Client;
import net.lecigne.training1.util.JDBC;

@Repository("sqlDao")
public class SQLClientDao extends JDBC implements ManualClientDao {

	@Override
	public void sauvegarder(Client client) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		try {
			cnx = seConnecter();
			String sql = "insert into `client` (`nom`, `prenom`, `login`, `password`) values (?, ?, ?, ?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, client.getNom());
			pstmt.setString(2, client.getPrenom());
			pstmt.setString(3, client.getLogin());
			pstmt.setString(4, client.getPassword());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt);
		}
	}

	@Override
	public void modifier(Client client) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		try {
			cnx = seConnecter();
			String sql = "update `client` set `nom` = ?, "
					+ "`prenom` = ?, "
					+ "`login` = ?, "
					+ "`password` = ? "
					+ "where `id` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, client.getNom());
			pstmt.setString(2, client.getPrenom());
			pstmt.setString(3, client.getLogin());
			pstmt.setString(4, client.getPassword());
			pstmt.setLong(5, client.getId());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt);
		}
	}

	@Override
	public Client obtenir(Long idClient) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Client client = null;
		try {
			cnx = seConnecter();
			String sql = "select * from `client` where `id` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setLong(1, idClient);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				long id = rs.getLong("id");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String login = rs.getString("login");
				String password = rs.getString("password");
				client = new Client(nom, prenom, login, password);
				client.setId(id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}
		return client;
	}

	@Override
	public List<Client> obtenirTous() {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Client> clients = new ArrayList<>();
		try {
			cnx = seConnecter();
			String sql = "select * from `client`";
			pstmt = cnx.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				long idClient = rs.getLong("id");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String login = rs.getString("login");
				String password = rs.getString("password");
				Client client = new Client(nom, prenom, login, password);
				client.setId(idClient);
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
	public void supprimer(Long idClient) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		try {
			cnx = seConnecter();
			String sql = "delete from `client` where `id` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setLong(1, idClient);
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt);
		}
	}

}
