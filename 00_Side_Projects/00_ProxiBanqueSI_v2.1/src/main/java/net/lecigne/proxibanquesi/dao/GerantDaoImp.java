package net.lecigne.proxibanquesi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.lecigne.proxibanquesi.model.Gerant;

public class GerantDaoImp extends DaoJDBC implements GerantDao {

	@Override
	public Gerant obtenirGerantByLogin(String login) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Gerant gerant = null;
		try {
			cnx = seConnecter();
			String sql = "select * from `gerant` where `login` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, login);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int idgerant = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String pwd = rs.getString(5);
				gerant = new Gerant(prenom, nom, login, pwd);
				gerant.setId(idgerant);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}
		return gerant;
	}
	
}
