package com.deepsingh44.prestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		try (Connection con = Dao.getConnection();) {
			// object of statement
			PreparedStatement ps = con.prepareStatement("update deep1 set name=? where id=?");
			ps.setString(1, "Mukesh");
			ps.setInt(2, 3);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
