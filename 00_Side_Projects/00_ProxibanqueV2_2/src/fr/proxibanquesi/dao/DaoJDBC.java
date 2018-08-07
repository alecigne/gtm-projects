package fr.proxibanquesi.dao;

import java.sql.*;

/**
 * Cette classe abstraite permet d'établir une connexion et une déconnexion à la
 * base de données MySQL locale avec les Drivers et l'url nécessaire pour
 * atteindre les bases de données
 * 
 * @author Anthony le Cigne et Jean-Michel Hiltbrunner
 *
 */
public abstract class DaoJDBC {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/proxibanquesi";
	private static final String login = "root";
	private static final String password = "";

	/**
	 * Ouvre une connexion à la base de données sdont l'url est spécifiée dans le
	 * String url
	 * 
	 * @return Une connection à la base de données
	 * @throws ClassNotFoundException
	 *             Si le driver chargé n'est pas implémenté ou n'existe pas à
	 *             l'adresse mentionnée
	 * @throws SQLException
	 *             si une erreur SQL est pointée lors de la connexion à la base de
	 *             données
	 */
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection cnx = null;
		Class.forName(driver);
		cnx = DriverManager.getConnection(url, login, password);
		return cnx;
	}

	/**
	 * Cette méthode permet de libérer les ressources systèmes en fermant connexion
	 * à la BDD, les requêtes SQL et les résultats des requêtes SQL.
	 * 
	 * @param cnx
	 *            Connexion à la base de données MySQL
	 * @param pstmt
	 *            Statements utilisés pour réaliser les requêtes SQL
	 * @param rs
	 *            Tableau des résultats des requêtes SQL
	 */
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
