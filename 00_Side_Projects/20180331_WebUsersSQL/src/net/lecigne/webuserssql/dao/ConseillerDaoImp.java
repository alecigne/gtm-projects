package net.lecigne.webuserssql.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.lecigne.webuserssql.model.Conseiller;

public class ConseillerDaoImp extends DaoJDBC implements IConseillerDao {

	@Override
	public void creerConseiller(Conseiller conseiller) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cnx = this.getConnection();
			String sql = "insert into `conseiller` (`login`, `password`, `nom`, `prenom`)"
					+ " VALUES (?, ?, ?, ?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, conseiller.getLogin());
			pstmt.setString(2, conseiller.getPassword());
			pstmt.setString(3, conseiller.getNom());
			pstmt.setString(4, conseiller.getPrenom());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
	}

	@Override
	public Conseiller obtenirConseiller(String login) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Conseiller conseiller = null;
		try {
			cnx = this.getConnection();
			String sql = "select `password`, `nom`, `prenom` from `conseiller`"
					+ " where `login` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, login);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String password = rs.getString(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				conseiller = new Conseiller(password, nom, prenom);
				conseiller.setLogin(login);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
		return conseiller;
	}

}
