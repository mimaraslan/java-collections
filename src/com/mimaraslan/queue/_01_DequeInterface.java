package com.mimaraslan.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class _01_DequeInterface {

	public static void main(String[] args) {

		Deque<String> myDeque1 = new ArrayDeque<>(); 
		
		myDeque1.add("B");
		myDeque1.add("A");
		myDeque1.add("Z");
		myDeque1.add("C");
		myDeque1.add("C");
	  //myDeque1.add(null); //NullPointerException
		


		for (String str : myDeque1) {
			System.out.println(str);
		}
		System.out.println("-------------------");
		
		for (Iterator itr = myDeque1.descendingIterator(); itr.hasNext();) {
	            System.out.print(itr.next() + " ");
	        }
		System.out.println("-------------------");
		
		Iterator itr = myDeque1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
