package com.collections.lists;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MapPrac {
	public static void main(String[] args) {
		
//		Map<String , Integer> mp = new HashMap<>();
//		
//		mp.put("hargovind", 1);
//		mp.put("him", 2);
//		mp.put("vai", 3);
//		mp.put("vik", 4);
//		mp.put("aman", 5);
//		
//		mp.remove("vik");
//		System.out.println(mp.get("asd"));
//		
//		System.out.println(mp.containsKey("vik"));
//		
//		Set<Map.Entry<String , Integer>> entry = mp.entrySet();
//		for(Map.Entry<String , Integer> ent : entry) {
//			System.out.println(ent.getKey() + "," + ent.getValue());
//		}
//		
//		Set<String> keyset = mp.keySet();
//		for(String ent : keyset) {
//			System.out.println(ent + "," + mp.get(ent));
//		}
		
		NavigableMap<Integer , String> mp = new TreeMap<>();
	
		mp.put(1, "har");
		mp.put(2, "h");
		mp.put(3, "a");
		mp.put(4, "r");
		
		mp.remove(2);
		
		System.out.println(mp.get(3));
		
		Set<Entry<Integer, String>> ent = mp.entrySet();
		for(Map.Entry<Integer, String> en : ent) {
			System.out.println(en.getKey() + "," + en.getValue());
		}
		
		Set<Integer> ent1 = mp.keySet();
		for(Integer en : ent1) {
			System.out.println(en + "," + mp.get(en));
		}
	}
}