package me.leandro.designpattern.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "root");
			return connection;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
