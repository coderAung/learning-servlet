package edu.ucsy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	
	private static final String URL = "jdbc:mysql://localhost:3306/course_db";

	public static Connection getConnection() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return DriverManager.getConnection(URL, "root", "admin");
	}
}
