package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcexample {
	
	public static void  main (String[] args) {

	 try
	 {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b28","root","Desika");
		Statement st= conn.createStatement();
		
		String str="select title,price,qty from books";
		System.out.println("the sql statements is" + str+ "\n");
		
		 
	 }catch (SQLException e)
	 {
		 e.printStackTrace();
		 
	 }
	
		



	}
}