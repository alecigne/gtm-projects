package net.lecigne.httpfilter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.lecigne.httpfilter.model.User;

public class UserDaoImp extends DaoJDBC implements UserDao {

	@Override
	public void createUser(User user) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		try {
			cnx = seConnecter();
			String sql = "insert into `user` (`login`, `pwd`) values (?, ?)";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, user.getLogin());
			pstmt.setString(2, user.getPassword());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt);
		}
	}

	@Override
	public User getUserByLogin(String login) {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		try {
			cnx = seConnecter();
			String sql = "select * from `user` where `login` = ?";
			pstmt = cnx.prepareStatement(sql);
			pstmt.setString(1, login);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int id = rs.getInt(1);
				String log = rs.getString(2);
				String pwd = rs.getString(3);
				user = new User(log, pwd);
				user.setId(id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			seDeconnecter(cnx, pstmt, rs);
		}
		return user; 
	}

}
