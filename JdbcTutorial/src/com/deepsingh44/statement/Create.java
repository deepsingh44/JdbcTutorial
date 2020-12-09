package com.deepsingh44.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//MySQL 5.x
//Driver class: com.mysql.jdbc.Driver
//url:jdbc:mysql://localhost:3306/morning


//Oracle 10 g
//Driver class: oracle.jdbc.driver.OracleDriver
//url:jdbc:oracle:thin:@localhost:1521:xe


public class Create {
public static void main(String[] args) throws ClassNotFoundException, SQLException {

	//load your driver class
	Class.forName("com.mysql.jdbc.Driver");
	//get connection
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/morning", "root", "root");
	//object of statement
	Statement smt=con.createStatement();
	//execute your query
	smt.execute("create table deep1 (id int,name varchar(20))");
	//close your connection
	con.close();
	
}
}
