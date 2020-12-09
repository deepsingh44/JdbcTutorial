package com.deepsingh44.prestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Fetch {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//load your driver class
			Class.forName("com.mysql.jdbc.Driver");
			//get connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/morning", "root", "root");
			//object of statement
			PreparedStatement ps=con.prepareStatement("select * from deep1");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
}
}
