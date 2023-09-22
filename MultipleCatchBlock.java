package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter value for n1");
			int n1 = sc.nextInt();
			
			System.out.println("Enter value for n2");
			int n2 = sc.nextInt();
			
			int res = n1/n2;
			
			System.out.println("Division of two numbers is "+ res);
		}
		catch(ArithmeticException e) {
			
			System.out.println("please do not enter 0 in denominator");
		}
		catch(InputMismatchException e) {
			
			System.out.println("Enter only Integer values");
		}
		catch(Exception e) {
			System.out.println("please enter valid input");
			e.printStackTrace();
		}
			

	}

}
