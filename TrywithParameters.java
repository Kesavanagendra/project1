package com.exception;

import java.io.FileWriter;
import java.io.IOException;

public class TrywithParameters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			
			FileWriter myWriter = new FileWriter("test.txt");
			
			myWriter.write("Hello world");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("No file found");
			
		}
		
		
		
		
		
		
		
		

	}

}
