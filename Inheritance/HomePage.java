/*
 * Single inhertitance - one parent class has only one child class.
 * Multiple inheritance - one child class extends the multiple parent class. but it doesn't support in java.
 * Multi level inheritance - In Multi-level Inheritance, one class can inherit properties from a derived class. 
 * 							 Hence, the derived class becomes the base class for the new class.
 */


package com.inheritance;

public class HomePage extends Base{
	
	public void Homepagetest() {
		System.out.println("Test fro Home Page");
	}
	
	public static void main(String args[]) {
		
		HomePage obj = new HomePage();
		obj.openbrowser("chrome");
		obj.login("admin","admin");
		obj.Homepagetest();
		obj.logout();
	}

	

}
