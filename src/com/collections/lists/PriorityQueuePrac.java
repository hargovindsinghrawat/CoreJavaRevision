package com.collections.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueuePrac {

	public static void main(String[] ags) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(9);
		pq.offer(2);
		pq.offer(7);
		pq.offer(4);
	
		System.out.println(pq);
		
		List<Integer> l = new ArrayList<>();
		
		int idx = 0;
		while(!pq.isEmpty()) {
			if(idx == 2) {
				break;
			}
			l.add(pq.poll());
			idx++;
		}
		System.out.println(l);
		System.out.println(pq);
	}
}