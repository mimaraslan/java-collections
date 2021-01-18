package com.mimaraslan.list.vector;

import java.util.*;

public class _01_MyVector {
	public static void main(String args[]) {

		Vector<String> myList = new Vector<String>();
		myList.add("B");
		myList.add("A");
		myList.add("Z");
		myList.add("C");

		Iterator<String> itr = myList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
