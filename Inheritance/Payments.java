package com.inheritance;

public class Payments extends HomePage {
	
	public void payments() {
		System.out.println("Test payments page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payments obj = new Payments();
		obj.openbrowser("chrome");
		obj.login("admin", "admin@123");
		obj.Homepagetest();
		obj.payments();
		obj.logout();

	}

}
