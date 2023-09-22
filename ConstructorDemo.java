/*class - A class is a blueprint from which individual objects are created.

object - An object is an instance of a class. Objects have states and behaviors.

constructor - 	Each time a new object is created, at least one constructor will be invoked.
				The main rule of constructors is that they should have the same name as the class.
				A class can have more than one constructor.*/


package com.sample;

public class ConstructorDemo {
	
	int s1=90, s2=90, s3=100;
	
	public ConstructorDemo() {
		
	}
	
	public ConstructorDemo(int s1, int s2, int s3) {
		this.s1 = s1;
		this.s2=s2;
		this.s3=s3;
		
	}
	
	public int sumMarks() {
		int res = s1+s2+s3;
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo obj = new ConstructorDemo();
		int sum = obj.sumMarks();
		System.out.println("Sum of three subject marks is "+sum);

	}

}
