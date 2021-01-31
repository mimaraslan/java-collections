package com.mimaraslan.set.linkedhashset;

import java.util.*;

public class MyLinkedHashSet {
	public static void main(String args[]) {

		Set<String> mySet1 = new LinkedHashSet<String>();
		LinkedHashSet<String> mySet2 = new LinkedHashSet<String>();
		mySet1.add("B");
		mySet1.add("A");   
		mySet1.add("Z");
		mySet1.add("C");
		mySet1.add("C");
		mySet1.add(null);
		

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
 
LinkedHashSet contains unique elements only like HashSet.

LinkedHashSet provides all optional set operations and permits null elements.

LinkedHashSet is non-synchronized.

LinkedHashSet maintains insertion order.
HashSet doesn't maintain the insertion order. 

 */
