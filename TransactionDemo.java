/*
 * Transaction Management-
The ACID properties describes the transaction management well.
ACID stands for Atomicity, Consistency, isolation and durability.
Atomicity means either all successful or none.
Consistency ensures bringing the database from one consistent state to another consistent state.
Isolation ensures that transaction is isolated from other transaction.
Durability means once a transaction has been committed, it will remain so, even in the event of errors, power loss etc.
*/
package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String driver  = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		String q1 = "insert into movies values('movie10', 'comedy','director10','1957')";
		
		String q2 = "insert into movies values('jdbc','Comedy','dir3','1926')";
	
		String q3 = "update movies set director ='john' where title ='movie10'";
		
		String q4 = "delete from movies where title = 'movie10'";
		
		boolean flag = false;
		
		conn.setAutoCommit(false);
		
		Statement st = conn.createStatement();
		
		st.addBatch(q1);
		st.addBatch(q2);
		st.addBatch(q3);
		st.addBatch(q4);
		
		int result[] = st.executeBatch();
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
			
			if(result[i] == 0) {
				flag = true;
			}
			
		}
		
		if(flag == false) {
			conn.commit();
			System.out.println("Transaction successfull");
		}
		else {
			conn.rollback();
			System.out.println("Transaction not success");
		}
				

	}

}
