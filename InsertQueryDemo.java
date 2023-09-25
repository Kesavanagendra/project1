package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String driver  = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/animated_movies";
		String user = "root";
		String password = "root";
		
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter title");
		String title = sc.next();
		System.out.println("Enter genre");
		String genre = sc.next();
		System.out.println("Enter director");
		String director = sc.next();
		System.out.println("Enter year");
		int release_year = sc.nextInt();
		
		String sql = "select * from movies where title = ?";
		
		PreparedStatement pst = conn.prepareStatement(sql);
		
		pst.setString(1, title);
		
		
		ResultSet rs = pst.executeQuery();
		
		if(!rs.next()) {
			sql = "insert into movies values(?,?,?,?)";
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, title);
			pst.setString(2, genre);
			pst.setString(3, director);
			pst.setInt(4,release_year);
			
			int i = pst.executeUpdate();
			
			if(i>0) {
				System.out.println("Inserted successfully");
			}
			else {
				System.out.println("not inserted");
			}
			
		}
		else {
			System.out.println("its already exists");
		}
		

	}

}
