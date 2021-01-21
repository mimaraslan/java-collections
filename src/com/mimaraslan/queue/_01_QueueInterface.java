package com.mimaraslan.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _01_QueueInterface {

	public static void main(String[] args) {
		Queue<String> myQueue1 = new PriorityQueue<>();  
		Queue<String> myQueue2 = new ArrayDeque<>(); 
		
		myQueue1.add("B");
		myQueue1.add("A");
		myQueue1.add("Z");
		myQueue1.add("C");
		myQueue1.add("C");
		//myQueue1.add(null); //NullPointerException
		
		Iterator itr = myQueue1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
