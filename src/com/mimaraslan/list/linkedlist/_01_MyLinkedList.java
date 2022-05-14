package com.mimaraslan.list.linkedlist;
/* FASTER

Java LinkedList class can contain duplicate elements.

Java LinkedList class maintains insertion order.

Java LinkedList class is non synchronized.

In Java LinkedList class, manipulation is fast because no shifting needs to occur.

Java LinkedList class can be used as a list, stack or queue.
*/

import java.util.*;

public class _01_MyLinkedList {
	public static void main(String args[]) {

		List<String> myList1 = new LinkedList<>();
		ArrayList<String> myList2 = new ArrayList<>();
		
		myList1.add(0,"B");
		myList1.add("A"); // myList1.set(1,"LOLO");  
		myList1.add("Z");
		myList1.add("C");
		myList1.add("C");
		myList1.add(null);

	    for (int i = 0; i < myList1.size(); i++) {
			System.out.println(myList1.get(i));
		}
		
		System.out.println("-------------------");

		for (String str : myList1) {
			System.out.println(str);
		}
		
		System.out.println("-------------------");
		
	    myList1.forEach((e) -> { // lambda expression  
		      System.out.println(e);
		    });
		System.out.println("-------------------");
			
	   // Collections.sort(myList1);  

		Iterator itr = myList1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}


	}
}

