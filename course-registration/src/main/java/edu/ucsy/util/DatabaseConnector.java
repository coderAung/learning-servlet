package edu.ucsy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	
	private static final String URL = "jdbc:mysql://localhost:3306/course_db";

	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(URL, "root", "admin");
	}
}
