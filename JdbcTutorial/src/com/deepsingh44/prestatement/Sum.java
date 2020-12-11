package com.deepsingh44.prestatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sum {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try (Connection con = Dao.getConnection();) {
			// object of statement
			PreparedStatement ps = con.prepareStatement("select sum(id) from deep1");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getInt(1));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
