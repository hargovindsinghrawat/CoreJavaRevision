package com.hashmap.prac;

public class HashmapPac {

	public static void main(String[] args) {
		
		OurMap<Integer, String> nameToLen = new OurMap<>();
		nameToLen.put(1,"sin");
		nameToLen.put(6,"gov");
		nameToLen.put(5,"wat");
		nameToLen.put(3,"raw");
		nameToLen.put(5,"har");
		
		System.out.println(nameToLen.get(5));
		System.out.println(nameToLen.get(1));
		System.out.println(nameToLen.get(6));
		System.out.println(nameToLen.get(3));
		System.out.println(nameToLen.get(7));
	}
}