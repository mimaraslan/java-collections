package com.mimaraslan.list.linkedlist._02_model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
	public static void main(String[] args) {

		List<Book> myList1 = new LinkedList<Book>();

		Book b1 = new Book(101, "C", "Yashwant", "BPB", 8);
		Book b2 = new Book(102, "Data", "Forouzan", " Hill", 4);
		Book b3 = new Book(103, "Operating", "Galvin", "Wiley", 6);

		myList1.add(b1);
		myList1.add(b2);
		myList1.add(b3);

		for (Book b : myList1) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		
		System.out.println("-------------------");
		
		for (int i = 0; i < myList1.size(); i++) {
			System.out.println(myList1.get(i));
		}
		
		System.out.println("-------------------");

		for (Book str : myList1) {
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

/* FASTER

Java LinkedList class can contain duplicate elements.

Java LinkedList class maintains insertion order.

Java LinkedList class is non synchronized.

In Java LinkedList class, manipulation is fast because no shifting needs to occur.

Java LinkedList class can be used as a list, stack or queue.
*/
		