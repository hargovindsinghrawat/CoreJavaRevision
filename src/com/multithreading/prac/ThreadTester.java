package com.multithreading.prac;

public class ThreadTester {

	public static void main(String[] args) {
			
//		Thread td = new Thread1("Thread1");
////		td.setDaemon(true);
//		td.start();
//		
		System.out.println("main is starting");
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
		
//		Stack stack = new Stack(5);
//		
//		new Thread(() -> {
//			int counter = 0;
//			while(++ counter < 0) {
//				System.out.println("Pushed: " + stack.push(100));
//			}
//		}, "Pusher").start();
//		
//		new Thread(() -> {
//			int counter = 0;
//			while(++ counter < 0) {
//				System.out.println("Popped: " + stack.pop());
//			}
//		}, "Popper").start();
		
		
//		Thread thread3 = new Thread(() -> {
//			try {
//				Thread.sleep(1);
//				for(int i=1000;i>0;i--);
//			} catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}, "States");
//		
//		thread3.start();
//		
//		while(true) {
//			Thread.State state = thread3.getState();
//			System.out.println(state);
//			if(state == Thread.State.TERMINATED) break;
//		}
		
//		Thread thread4 = new Thread(() -> {
//			System.out.println(Thread.currentThread());
//		}, "Our thread");
//		
//		thread4.start();
//		
//		try {
//			thread4.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(thread4.getPriority());
//		
//		thread4.setPriority(1);
//		
		
		String lock1 = "har";
		String lock2 = "rawat";
		
		Thread thread1 = new Thread(() ->{
			synchronized(lock1) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("Lock acquired");
				}
			}
		}, "thread1");
		
		Thread thread2 = new Thread(() ->{
			synchronized(lock2) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("Lock acquired");
				}
			}
		}, "thread2");
		
//		System.out.println("main is existing");
	} 
}