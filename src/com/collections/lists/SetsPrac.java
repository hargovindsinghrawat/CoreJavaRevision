package com.collections.lists;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

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
		
		/*
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(4);
		set.add(8);
		set.remove(3);
	
		System.out.println(set);
		*/
		
		/*
		Set<Integer> st = new TreeSet<>();
		
		st.add(1);
		st.add(9);
		st.add(2);
		st.add(3);
		st.add(8);
		st.add(5);
		st.add(6);
		st.add(4);
		
		System.out.println(st);
		*/
		
		NavigableSet<Integer> st = new TreeSet<>();
		
		st.add(1);
		st.add(9);
		st.add(2);
		st.add(3);
		st.add(8);
		st.add(5);
		st.add(6);
		st.add(4);
		
		System.out.println(st);
		
		System.out.println(st.floor(20));
		System.out.println(st.higher(8));
	}
}
