package com.mimaraslan.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//https://home.csulb.edu/~pnguyen/cecs277/lecnotes/hashtree.pdf

public class _01_SetInterface {
	public static void main(String[] args) {
		
		Set<String> mySet1 = new HashSet<>();  
		Set<String> mySet2 = new LinkedHashSet<>();  
		Set<String> mySet3 = new TreeSet<>();  // SORT but doesn’t allow null
	
		HashSet<String> mySet4 = new HashSet<>();  
		LinkedHashSet<String> mySet5 = new LinkedHashSet<>();  
		TreeSet<String> mySet6 = new TreeSet<>();  // SORT but doesn’t allow null
		
		mySet1.add("B");
		mySet1.add("A");
		mySet1.add("Z");
		mySet1.add("C");
		mySet1.add("C");
		mySet1.add(null); // NullPointerException for TreeSet
		mySet1.add(null); // NullPointerException for TreeSet

		Iterator itr = mySet1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
