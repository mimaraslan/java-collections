package com.mimaraslan.set.treeset;

import java.util.*;

public class MySortedSet {
	public static void main(String args[]) {

		SortedSet<String> mySet1 = new TreeSet();
		mySet1.add("B");
		mySet1.add("A");   
		mySet1.add("Z");
		mySet1.add("C");
		mySet1.add("C");
		//mySet1.add(null);

		Iterator<String> itr = mySet1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
