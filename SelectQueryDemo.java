/*
* ResultSet
A ResultSet object maintains a cursor that points to the current row in the result set. 
The term "result set" refers to the row and column data contained in a ResultSet object.

*Connections
The Connection interface represents a connection to a database.
It is responsible for establishing a connection, managing the connection state, and providing methods for executing SQL statements.

*Statement
The Statement interface is used to execute SQL statements against a database.
Statement: Used for executing simple SQL queries with no parameters.
PreparedStatement: Used for precompiled SQL queries with parameters.Provides better performance and security.*/


package com.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String driver  = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		String sql = "select * from movies";
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		System.out.println("Title \t        genre \t director \trelease_year");
		
		while(rs.next()) {
			
			String title = rs.getString("title");
			String genre = rs.getString("genre");
			String director = rs.getString("director");
			int year = rs.getInt("release_year");
			
			System.out.println(title+"\t"+genre +"\t"+director +"\t"+year);
		}
		
		conn.close();
	}

}
