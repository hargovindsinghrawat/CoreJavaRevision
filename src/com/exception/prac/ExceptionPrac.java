package com.exception.prac;

public class ExceptionPrac {
	
	public static void main(String[] args) {
		
		System.out.println("started");
		int i = 9;
		int j = 0;
		
		int k = 0;
		int nums[] = {1,2,3,4,5};
		try{
			k = i/j;
			System.out.println(nums[4]);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println(k);
		
		System.out.println("ended");
	}
}