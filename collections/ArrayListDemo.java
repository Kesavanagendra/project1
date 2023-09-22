package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> aob = new ArrayList<>();
		
		aob.add("London");
		aob.add("Paris");
		aob.add(2,"New Delhi");
		aob.add("Mumbai");
		
		System.out.println(aob.size());
		
		for(String s : aob) {
			System.out.println(s);
		}

	}

}
