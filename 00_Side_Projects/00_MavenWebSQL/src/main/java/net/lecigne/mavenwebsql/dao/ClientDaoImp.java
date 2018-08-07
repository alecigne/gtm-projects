package net.lecigne.mavenwebsql.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import net.lecigne.mavenwebsql.model.Client;

public class ClientDaoImp extends DaoJDBC implements ClientDao {

	public void creerClient(Client client) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		try {
			cnx = this.seConnecter();
			String sql = "insert into `client` (`nom`, `prenom`) values (?, ?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, client.getNom());
			pstmt.setString(2, client.getPrenom());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.seDeconnecter(cnx, pstmt);
		}
	}

	public Client obtenirClient(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Client> obtenirTousClients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void modifierClient(int idClient, Client client) {
		// TODO Auto-generated method stub
		
	}

	public void supprimerClient(int idClient) {
		// TODO Auto-generated method stub
		
	}

}
