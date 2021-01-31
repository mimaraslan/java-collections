package com.mimaraslan.set.treeset;

import java.util.*;

public class MyTreeSet {
	public static void main(String args[]) {

		TreeSet treeSet = new TreeSet();   
		Set syncrSet = Collections.synchronizedSet(treeSet);  
		
		TreeSet<String> mySet1 = new TreeSet();
		mySet1.add("B");
		mySet1.add("A");   
		mySet1.add("Z");
		mySet1.add("C");
		mySet1.add("C");
	   //mySet1.add(null); // NullPointerException

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
		
		
		 System.out.println("Initial Set: "+mySet1);  
         
         System.out.println("Reverse Set: "+mySet1.descendingSet());  
           
         System.out.println("Head Set: "+mySet1.headSet("C", true));  
          
         System.out.println("SubSet: "+mySet1.subSet("A", false, "E", true));  
           
         System.out.println("TailSet: "+mySet1.tailSet("C", false));  
		
         
         
         
         System.out.println("Head Set: "+mySet1.headSet("C"));  
          
         System.out.println("SubSet: "+mySet1.subSet("A", "E"));  
           
         System.out.println("TailSet: "+mySet1.tailSet("C"));  
		
	}
}



/*
 TreeSet doesn't allow null element. // NullPointerException

 TreeSet contains unique elements only like HashSet.
 
 TreeSet access and retrieval times are quiet fast.
 
 TreeSet is non synchronized.
 
 TreeSet maintains ascending order.
 
 TreeSet can only allow those generic types that are comparable. 
 Comparable interface is being implemented by the StringBuffer.

*/