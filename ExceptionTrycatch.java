/*
* Exception handling
Exceptions occur when there is an error or warning in the execution of the program.
When an exception occurs, the normal flow of the program will get disturbed and the program will be terminated abnormally. 
The good thing about the exception is we can handle it by using a try-catch block or throws keyword.
*/
package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExceptionTrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String driver  = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/animated_movies";
		String user = "root";
		String password = "root";
		
		try {
		
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

			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Not found");
		}
		

	}

}
