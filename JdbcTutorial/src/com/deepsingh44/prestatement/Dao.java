package com.deepsingh44.prestatement;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
	private static Connection con;

	public static Connection getConnection() {
		try {
			// load your driver class
			Class.forName("com.mysql.jdbc.Driver");
			// get connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/morning", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
