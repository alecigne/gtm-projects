package fr.proxibanquesi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import fr.proxibanquesi.model.*;

/**
 * Cette classe développe les méthodes décrites dans l'interface CompteDao afin
 * de réaliser les opérations du CRUD sur les Comptes courants et les comptes
 * épargnes
 * 
 * @author Anthony le Cigne et Jean-Michel Hiltbrunner
 *
 */
public class CompteDaoImp extends DaoJDBC implements CompteDao {

	@Override
	public void creerCompteCourant(CompteCourant compteCourant) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cnx = this.getConnection();
			String sql = "insert into `comptecourant` (`numcompte`, `solde`, `dateouverture`, `idclient`)"
					+ " VALUES (?, ?, ?, ?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, compteCourant.getNumeroCompte());
			pstmt.setDouble(2, compteCourant.getSolde());
			pstmt.setString(3, compteCourant.getDateOuverture());
			pstmt.setInt(4, compteCourant.getIdClient());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
	}

	@Override
	public void creerCompteEpargne(CompteEpargne compteEpargne) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cnx = this.getConnection();
			String sql = "insert into `compteepargne` (`numcompte`, `solde`, `dateouverture`, `tauxremun`, `idclient`)"
					+ " VALUES (?, ?, ?, ?, ?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, compteEpargne.getNumeroCompte());
			pstmt.setDouble(2, compteEpargne.getSolde());
			pstmt.setString(3, compteEpargne.getDateOuverture());
			pstmt.setDouble(4, compteEpargne.getTauxRemun());
			pstmt.setInt(5, compteEpargne.getIdClient());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
	}

	@Override
	public CompteCourant obtenirCompteCourant(int idClient) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CompteCourant compteCourant = null;
		try {
			cnx = this.getConnection();
			String sql = "select * from `comptecourant` where `idclient` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, idClient);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int numcompte = rs.getInt(1);
				double solde = rs.getInt(2);
				String datecreation = rs.getString(3);
				int idclient = rs.getInt(4);
				compteCourant = new CompteCourant(numcompte, solde, datecreation, idclient);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
		return compteCourant;
	}

	@Override
	public CompteEpargne obtenirCompteEpargne(int idClient) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CompteEpargne compteEpargne = null;
		try {
			cnx = this.getConnection();
			String sql = "select * from `compteepargne` where `idclient` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, idClient);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int numcompte = rs.getInt(1);
				double solde = rs.getInt(2);
				String datecreation = rs.getString(3);
				double tauxremun = rs.getDouble(4);
				int idclient = rs.getInt(5);
				compteEpargne = new CompteEpargne(numcompte, solde, datecreation, idclient);
				compteEpargne.setTauxRemun(tauxremun);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}
		return compteEpargne;
	}

	@Override
	public void modifierCompteCourant(int idClient, CompteCourant compteCourant) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cnx = this.getConnection();
			String sql = "update `comptecourant` set `numcompte`= ?, `solde`= ?,"
					+ " `dateouverture`= ? where `idclient`= ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setInt(1, compteCourant.getNumeroCompte());
			pstmt.setDouble(2, compteCourant.getSolde());
			pstmt.setString(3, compteCourant.getDateOuverture());
			pstmt.setInt(4, idClient);
			pstmt.executeUpdate();
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			this.closeConnection(cnx, pstmt, rs);
		}

	}

}