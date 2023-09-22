package com.exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = null;
		
		try {	
					
			System.out.println("Length of String is "+s1.length());	
							
		}
		catch(Exception e){
			
			e.printStackTrace();
			
//			System.out.println(e.getMessage());	
			
		}

	}

}
