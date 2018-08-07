package fr.proxibanquesi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.proxibanquesi.model.Compte;

public class CompteDaoImp extends DaoJDBC implements CompteDao {

	@Override
	public void creerCompte(Compte compte) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cnx = this.getConnection();
			String sql = "insert into `compte` (`numcompte`, `solde`, `datecreation`, `idclient`)"
					+ " VALUES (?, ?, ?, ?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, compte.getNumero());
			pstmt.setDouble(2, compte.getSolde());
			pstmt.setString(3, compte.getDateOuverture());
			pstmt.setInt(4, compte.getIdclient());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
	}

	@Override
	public Compte obtenirCompte(int idClient) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Compte compte = null;
		try {
			cnx = this.getConnection();
			String sql = "select * from `compte` where `idclient` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, idClient);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String numcompte = rs.getString(1);
				int solde = rs.getInt(2);
				String datecreation = rs.getString(3);
				int idclient = rs.getInt(4);
				compte = new Compte(numcompte, solde, datecreation, idclient);				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
		return compte;
	}

}
