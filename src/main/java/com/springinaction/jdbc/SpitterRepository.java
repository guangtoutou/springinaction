package com.springinaction.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpitterRepository {
	@Autowired
	private DataSource ds;

	private String SQL_SELECT_SPITTER = "select id, username, fullname from spitter where id = ?";

	public void findSpitterByID(Long id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = ds.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT_SPITTER);
			stmt.setLong(1, id);
			rs = stmt.executeQuery();
			if (rs.next()) {
				System.out.print(rs.getString("username"));
				System.out.println(rs.getString("fullname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
