package com.string.prac;

public class StringPrac {

	public static void main(String[] args) {

		String s1 = "Hargovind";
//		System.out.println(s1.charAt(0));
		
//		s1 = "a" + s1.substring(1);
//		System.out.println(s1);
		
		String s2 = s1;
		System.out.println(s1==s2);
		
		s2 += "xyz";
		
		System.out.println(s1==s2);
		
		String s3 = new String("Hargovind");
		
		System.out.println(s3==s1);
		
		System.out.println(s3.equals(s1));
		
		String s4 = s3;
		
		System.out.println(s4==s3);
		
		s4 += "xyz";
		
		System.out.println(s4==s3);
		
		
	}
}
