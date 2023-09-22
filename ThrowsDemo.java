package com.exception;

public class ThrowsDemo {
	
	public void div(int a, int b)throws ArithmeticException {
		if(b==0) {
			
			throw new ArithmeticException();
		}
		else {
			
			int c = a/b;
			System.out.println("division of numbers is "+c);
		}
		
	}

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		
		ThrowsDemo obj = new ThrowsDemo();
		try {
			obj.div(20, 0);
		}
		catch(Exception e) {
			System.out.println("Further code Execution");
		}
	}

}
