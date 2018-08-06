package net.lecigne.webuserssql.dao;

import java.sql.*;

/**
 * Cette classe abstraite implémente entièrement les méthodes nécessaires au bon
 * déroulement d'une interaction (connexion, déconnexion) entre :
 * 
 * - une classe concrète de DAO utilisant JDBC<br>
 * - une base de données SQL.
 * 
 * Se référer aux classes concrètes de la présente couche DAO pour des exemples
 * d'extension de cette classe.
 * 
 * @author Anthony Le Cigne
 *
 */

public abstract class DaoJDBC {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/proxibanque";
	private static final String login = "root";
	private static final String password = "";

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection cnx = null;
		Class.forName(driver);
		cnx = DriverManager.getConnection(url, login, password);
		return cnx;
	}

	public void closeConnection(Connection cnx, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (cnx != null) {
				cnx.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
