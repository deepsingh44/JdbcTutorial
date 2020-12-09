package com.deepsingh44.prestatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	//load your driver class
		Class.forName("com.mysql.jdbc.Driver");
		//get connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/morning", "root", "root");
		//object of statement
		PreparedStatement ps=con.prepareStatement("insert into deep1 values(?,?)");
		ps.setInt(1,2);
		ps.setString(2, "Rohit");
		//execute your query
		ps.executeUpdate();
		//close your connection
		con.close();
}
}
