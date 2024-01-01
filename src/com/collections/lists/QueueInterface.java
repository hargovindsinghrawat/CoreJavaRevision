package com.collections.lists;

import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class QueueInterface {

	// add and remove throws exception if its full/empty
	// but Offer and poll didn't.
	public static void main(String[] args){
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
//		System.out.println(queue);
//		
//		System.out.println(queue.peek());
//		
//		System.out.println(queue.poll());
//		
		
//		System.out.println(queue);
		
		Stack<Integer> st = new Stack<>();
		
		st.push(1);
		st.push(2);
		
//		while(!st.isEmpty()) {
//			System.out.println(st.peek());
//			st.pop();
//		}
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.offerFirst(1);
		dq.offerFirst(3);
		dq.offerLast(2);
		
		System.out.println(dq);
		
		dq.pollFirst();
		
		System.out.println(dq);
		
		System.out.println(dq.peek());
	}
}