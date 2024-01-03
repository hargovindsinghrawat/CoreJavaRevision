package com.collections.lists;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetsPrac {

	public static void main(String[] args){
	
		/*
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(4);
		set.add(8);
		set.remove(2);
	
		System.out.println(set);
		*/
		
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(4);
		set.add(8);
		set.remove(3);
	
		System.out.println(set);
	}
}
