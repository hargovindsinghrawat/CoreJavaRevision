package com.multithreading.prac;

public class ThreadTester {

	public static void main(String[] args) {
			
//		Thread td = new Thread1("Thread1");
////		td.setDaemon(true);
//		td.start();
//		
//		System.out.println("main is starting");
//		
//		Thread td2 = new Thread(new Thread2() , "thread2");
//		td2.start();
//		
//		Thread td3 = new Thread(() -> {
//			for(int i=0;i<5;i++) {
//				System.out.println(Thread.currentThread().getName() + " " + i);
//			}
//		}, "thread3");
//		td3.start();
		
		Stack stack = new Stack(5);
		
		new Thread(() -> {
			int counter = 0;
			while(++ counter < 0) {
				System.out.println("Pushed: " + stack.push(100));
			}
		}, "Pusher").start();
		
		new Thread(() -> {
			int counter = 0;
			while(++ counter < 0) {
				System.out.println("Popped: " + stack.pop());
			}
		}, "Popper").start();
		
		
		System.out.println("main is existing");
	} 
}