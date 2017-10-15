package com.auribises.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		//Queue<Integer> q = new PriorityQueue<Integer>();
		
		//queue.clear(); list.clear(); set.clear();
		
		for(int i=10;i>0;i--){
			queue.add(i);
		}

		System.out.println(queue);
		
		for(int i=1;i<=10;i++){
			//System.out.println(queue.peek()); // Retrieve Head
			System.out.println(queue.poll()); // Remove and Retrieve Head
		}
		
	}

}
