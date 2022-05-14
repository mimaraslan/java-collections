package com.mimaraslan.list.arraylist;

/*

Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because the array works on an index basis.

In ArrayList, manipulation is a little bit slower than the LinkedList in Java
because a lot of shifting needs to occur if any element is removed from the array list.

We can not create an array list of the primitive types,
such as int, float, char, etc. It is required to use
the required wrapper class in such cases. For example:

*/

import java.util.*;

public class _01_ArrayList {
	public static void main(String[] args) {

		List<String> myList1 = new ArrayList<>();
		List<String> myList2 = new LinkedList<>();
		List<String> myList3 = new Vector<>();
		List<String> myList4 = new Stack<>();

		ArrayList<String> myList5 = new ArrayList<>();
		LinkedList<String> myList6 = new LinkedList<>();
		Vector<String> myList7 = new Vector<>();
		Stack<String> myList8 = new Stack<>();

		myList1.add("B");
		myList1.add(1,"A"); // myList1.set(1,"E");  //  myList1.remove(0);  
		myList1.add("Z");
		myList1.add("C");
		myList1.add("C");
	    myList1.add(null);

        
		for (int i = 0; i < myList1.size(); i++) {
			System.out.println(myList1.get(i));
		}
		
		System.out.println("-------------------");

		for (String item : myList1) {
			System.out.println(item.toLowerCase());
		}
		
		System.out.println("-------------------");
		
	    myList1.forEach((e) -> { 
		      System.out.println(e);
		    });
		System.out.println("-------------------");
	
	   // Collections.sort(myList1);  

		Iterator itr = myList1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		
		System.out.println("-----forEachRemaining() method:");  
        Iterator<String> itr2=myList1.iterator();  
        itr2.forEachRemaining(a-> {  
        	System.out.println(a);  
        });  
	}
}



