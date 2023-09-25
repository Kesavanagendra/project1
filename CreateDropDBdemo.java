package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDropDBdemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String driver  = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/animated_movies";
		String user = "root";
		String password = "root";
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);

		String sql = "create database demo_database";
		String query1 = "use demo_database";
		String query2 = "drop database demo_database";
		
		Statement st = conn.createStatement();
		
		st.executeUpdate(sql);
		System.out.println("Database Created successfully");
		
		st.executeUpdate(query1);
		System.out.println("Database selected successfully");
		
		st.executeUpdate(query2);
		System.out.println("Database dropped successfully");
		
		
		
		
		
	}

}
