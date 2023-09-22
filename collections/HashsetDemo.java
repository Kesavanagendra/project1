package com.collections;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> obj = new HashSet<>();
		
		obj.add("New Delhi");
		obj.add("London");
		obj.add("Newyork");
		obj.add("Mumbai");
		obj.add("Paris");
		
		System.out.println(obj.size());
		
		System.out.println(obj.contains("New Delhi"));
		
		for(String s : obj) {
			System.out.println(s);
		}

	}

}
