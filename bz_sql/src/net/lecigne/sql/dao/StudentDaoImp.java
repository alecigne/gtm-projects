package net.lecigne.sql.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoImp extends DaoJDBC implements StudentDao {

	@Override
	public String getStudentGrade(String ssn, String courseId) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String grade = "";
		try {
			cnx = this.getConnection();
			String sql = "select grade from enrollment where ssn = ? and courseid = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, ssn);
			pstmt.setString(2, courseId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				grade = rs.getString(1);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			this.close(cnx, pstmt, rs);
		}
		return grade;
	}

}
