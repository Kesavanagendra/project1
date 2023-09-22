package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> aob = new LinkedList<>();
		
		aob.add("London");
		aob.add("Paris");
		aob.add(2,"New Delhi");
		aob.add("Mumbai");
		
		Iterator<String> iter = aob.iterator();
		
//		System.out.println(aob.get(2));
//		
//		System.out.println(aob.contains("New Delhi"));
//		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
