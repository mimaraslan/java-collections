package com.mimaraslan.set.hashset;

import java.util.*;

public class MyHashSet {
	public static void main(String args[]) {

		Set<String> mySet1 = new HashSet<String>();
		HashSet<String> mySet2 = new HashSet<String>();
		mySet1.add("B");
		mySet1.add("A");   
		mySet1.add("Z");
		mySet1.add("C");
		mySet1.add("C");
		mySet1.add(null);

	//	for (int i = 0; i < mySet1.size(); i++) {
	//		System.out.println(mySet1.;
	//	}
	//	System.out.println("-------------------");

		for (String item : mySet1) {
			System.out.println(item);
		}
		
		System.out.println("-------------------");

		mySet1.forEach((e) -> { 
			System.out.println(e);
		});
		
		System.out.println("-------------------");
		// Collections.sort(myList1);

		Iterator itr = mySet1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

/*
A List can contain duplicate elements 
whereas Set contains unique elements only!!!

 
 
HashSet stores the elements by using a mechanism called hashing.

HashSet contains unique elements only.

HashSet allows null value.

HashSet class is non synchronized.

HashSet doesn't maintain the insertion order. 
Here, elements are inserted on the basis of their hashcode.

HashSet is the best approach for search operations.

The initial default capacity of HashSet is 16, and the load factor is 0.75.
 
*/
