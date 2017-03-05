package com.springinaction.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class SpitterRepository {

	private JdbcOperations jdbcOperations;;

	private String SQL_SELECT_SPITTER = "select * from spitter where id = ?";

	@Autowired
	public SpitterRepository(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;

	}

	public void findSpitterByID(Long id) {

		List<Spitter> spitters = jdbcOperations.query(SQL_SELECT_SPITTER, new SpitterRowMapper(), id);
		for (Spitter spitter : spitters) {
			System.out.println(spitter.getFullName());
		}
	}

	private static final class SpitterRowMapper implements RowMapper<Spitter> {
		public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Spitter(rs.getLong("id"), rs.getString("username"), rs.getString("password"),
					rs.getString("fullName"), rs.getString("email"), rs.getBoolean("updateByEmail"));
		}
	}
}
