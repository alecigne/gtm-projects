package net.lecigne.proxibanquesi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.lecigne.proxibanquesi.model.Conseiller;

public class ConseillerDaoImp extends DaoJDBC implements ConseillerDao {

	@Override
	public void creerConseiller(Conseiller conseiller) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		try {
			cnx = seConnecter();
			String sql = "insert into `conseiller` (`nom`, `prenom`, `login`, `pwd`)"
					+ " VALUES (?, ?, ?, ?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, conseiller.getNom());
			pstmt.setString(2, conseiller.getPrenom());
			pstmt.setString(3, conseiller.getLogin());
			pstmt.setString(4, conseiller.getPassword());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt);
		}
	}

	@Override
	public Conseiller obtenirConseiller(String login) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Conseiller conseiller = null;
		try {
			cnx = seConnecter();
			String sql = "select * from `conseiller` where `login` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, login);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int idconseiller = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String pwd = rs.getString(5);
				conseiller = new Conseiller(prenom, nom, login, pwd);
				conseiller.setId(idconseiller);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}
		return conseiller;
	}

}
