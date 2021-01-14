package com.mimaraslan.list.arraylist._03_arraytolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {

	public static void main(String args[]) {

		String[] myArray = { "Java", "Python", "PHP", "C++" };

		System.out.println("Printing Array: " + Arrays.toString(myArray));

		List<String> myList1 = new ArrayList<String>();
		for (String item : myArray) {
			myList1.add(item); // Array to List
		}

		System.out.println("Printing List: " + myList1);
		System.out.println("-------------------");

		for (int i = 0; i < myList1.size(); i++) {
			System.out.println(myList1.get(i));
		}
		System.out.println("-------------------");

		for (String item : myList1) {
			System.out.println(item.toLowerCase());
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

		// ArrayList to Array
		String[] myArray2 = myList1.toArray(new String[myList1.size()]);
		System.out.println("Array: " + Arrays.toString(myArray2));
		System.out.println("List: " + myList1);

	}
}