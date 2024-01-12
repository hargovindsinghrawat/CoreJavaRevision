package com.string.prac;

import java.util.HashSet;
import java.util.Set;

public class StringTest {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		ImmutableClass obj = new ImmutableClass(1, "hargovind",set);
		set.add(3);
		
		Set<Integer> set2= obj.getSet();
//		System.out.println(set2);
		
		set2.add(4);
		
		System.out.println(set2);
		System.out.println(obj.getSet());
		
		
//		int id = obj.getId();
//		String name = obj.getName();
//		
//		System.out.println("id=" + id + " name=" + name);
			
	}
}