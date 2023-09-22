package com.inheritance;

public class Base {
	
	public void openbrowser(String browser) {
		System.out.println("open browser "+browser);
	}
	
	public void login(String username, String password) {
		System.out.println("Enter username"+ username);
		System.out.println("Enter password "+password);
		System.out.println("click on login");
		
	}
	
	public void logout() {
		System.out.println("This is a logout method");
	}

}
