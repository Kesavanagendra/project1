/*
*Stored procedure-
Stored procedure is a set of SQL statements stored together as a single block of code in the database 
which can be reused multiple times without having to write the queries again. 
A stored procedure may provide multiple output values and accepts input as well as output parameters.
 */

package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProcedureDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String driver  = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/animated_movies";
		String user = "root";
		String password = "root";
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		
		String query = "call SelectAllMovies()";
		
		Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery(query);
		
		System.out.println("Title \t        genre \t director \trelease_year");
		
		System.out.println("------------------------------------------------------");
		while(rs.next()) {
			
			String title = rs.getString("title");
			String genre = rs.getString("genre");
			String director = rs.getString("director");
			int year = rs.getInt("release_year");
			
			System.out.println(title+"\t"+genre +"\t"+director +"\t"+year);
			
//			System.out.print("Title: " + rs.getString("title") + "\t");
//			System.out.print("genre: " + rs.getString("genre") + "\t");
//			System.out.print("Director: " + rs.getString("director") + "\t");
//			System.out.println("release_year: " + rs.getString("release_year") + "\t");
//			
		}
		
		conn.close();
	}

}
