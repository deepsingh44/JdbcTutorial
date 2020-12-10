package com.deepsingh44.prestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load your driver class
		Class.forName("com.mysql.jdbc.Driver");
		// get connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/morning", "root", "root");
		// object of statement
		PreparedStatement ps = con.prepareStatement("delete from deep1 where id=?;");
		ps.setInt(1, 4);
		ps.executeUpdate();
		con.close();
	}
}
