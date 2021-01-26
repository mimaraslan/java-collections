package com.mimaraslan.queue;

import java.util.*;

public class MyPriorityQueue {
	public static void main(String args[]) {

		PriorityQueue<String> myQueue = new PriorityQueue<String>();

		myQueue.add("M");
		myQueue.add("E");
		myQueue.add("K");
		myQueue.add("B");
		myQueue.add("A");
		myQueue.add("Z");
		myQueue.add("C");

		System.out.println("head:" + myQueue.element()); // A
		System.out.println("head:" + myQueue.peek()); // A

		System.out.println("iterating the queue elements:");
		Iterator itr = myQueue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		myQueue.remove(); // A
		myQueue.poll(); // B

		System.out.println("after removing two elements:");
		Iterator<String> itr2 = myQueue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
