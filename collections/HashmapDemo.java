package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer , String> mob = new HashMap<>();
		
		mob.put(111, "Ram");
		mob.put(222, "Raj");
		mob.put(333, "Sai");
		mob.put(444, "Sri");
		
		
		for(Entry m : mob.entrySet()) {
			
			System.out.println(m.getKey() +" - "+m.getValue());
		}
		
		System.out.println(mob.containsKey(111));
		
		System.out.println(mob.remove(333, "Sai"));
		
		for(Entry m : mob.entrySet()) {
			
			System.out.println(m.getKey() +" - "+m.getValue());
		}

	}

}
