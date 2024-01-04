package com.collections.lists;

import java.util.HashMap;
import java.util.Map;

public class MapPrac {
	public static void main(String[] args) {
		
		Map<String , Integer> mp = new HashMap<>();
		
		mp.put("hargovind", 1);
		mp.put("him", 2);
		mp.put("vai", 3);
		mp.put("vik", 4);
		mp.put("aman", 5);
		
		mp.remove("vik");
		System.out.println(mp.get("asd"));
		
		System.out.println(mp.containsKey("vik"));
		}
}