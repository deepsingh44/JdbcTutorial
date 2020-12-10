package com.deepsingh44.prestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Like {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load your driver class
		Class.forName("com.mysql.jdbc.Driver");
		// get connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/morning", "root", "root");
		// object of statement
		PreparedStatement ps = con.prepareStatement("SELECT * FROM deep1 WHERE name LIKE ?");
		ps.setString(1, "r%");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(2));
		}
	}
}
