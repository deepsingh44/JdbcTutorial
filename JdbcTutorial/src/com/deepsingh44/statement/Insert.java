package com.deepsingh44.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	//load your driver class
		Class.forName("com.mysql.jdbc.Driver");
		//get connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/morning", "root", "root");
		//object of statement
		Statement smt=con.createStatement();
		//execute your query
		smt.executeUpdate("insert into deep1 values(1,'Deep Singh')");
		//close your connection
		con.close();
}
}
