package net.lecigne.sql.dao;

import java.sql.*;

public abstract class DaoJDBC {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection cnx = null;
		Class.forName("com.mysql.jdbc.Driver");
		cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/Formation", "root", "");
		return cnx;
	}

	public void close(Connection cnx, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (cnx != null)
				cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
