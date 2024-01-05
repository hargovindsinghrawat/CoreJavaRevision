package com.multithreading.prac;

public class ThreadTester {

	public static void main(String[] args) {
			
		Thread td = new Thread1("Thread1");
//		td.setDaemon(true);
		td.start();
		
		System.out.println("main is starting");
		
		Thread td2 = new Thread(new Thread2() , "thread2");
		td2.start();
		
		System.out.println("main is existing");
	}
}