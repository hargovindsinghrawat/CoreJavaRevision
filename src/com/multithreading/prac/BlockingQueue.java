package com.multithreading.prac;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
	private Queue<Integer> q;
	private int capacity;
	
	public BlockingQueue(int cap) {
		q = new LinkedList<>();
		int capacity = cap;
	}
	
	public boolean add(int item) {
		while(q.size() == capacity) {
			try {
				q.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		q.add(item);
		q.notifyAll();
		return true;
	}
	
	public int remove() {
		while(q.size() == 0) {
			try {
				q.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int ele = q.poll();
		q.notifyAll();
		return ele;
	}
}