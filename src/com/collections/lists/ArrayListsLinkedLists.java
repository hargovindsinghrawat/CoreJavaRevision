package com.collections.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListsLinkedLists {
	
	public static void main(String[] args){
		List<Integer> alist = new ArrayList<>();
		alist.add(1);
		alist.add(2);
		alist.add(4);
		alist.add(4);
		alist.add(4);
		alist.add(4);
		alist.add(4);
		
		Integer arr[] = alist.toArray(new Integer[0]);
		
		
//		System.out.println(alist.set(1, 100));
	
//		List<Integer> alist2 = new ArrayList(alist);
		
		List<Integer> alist2 = new ArrayList();
//		
		alist2.addAll(alist);
//		
//		System.out.println(alist);
//		System.out.println(alist2);
		
//		System.out.println(alist.indexOf(100));
		
		List<Integer> alist3 = alist.subList(1, 6);
		
//		System.out.println(alist3);
		
		List<Integer> llist = new LinkedList<>();
		
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		
//		System.out.println(llist);
		
	}
}