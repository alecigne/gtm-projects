package net.lecigne.httpfilter.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DaoJDBC {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/httpfilter";
	private static final String login = "root";
	private static final String password = "";

	public Connection seConnecter() throws ClassNotFoundException, SQLException {
		Connection cnx = null;
		Class.forName(driver);
		cnx = DriverManager.getConnection(url, login, password);
		return cnx;
	}

	public void seDeconnecter(Connection cnx, PreparedStatement pstmt) {
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
	
	public void seDeconnecter(Connection cnx, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.seDeconnecter(cnx, pstmt);
	}
}
