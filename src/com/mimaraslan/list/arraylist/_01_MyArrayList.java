package com.mimaraslan.list.arraylist;

import java.util.*;

class _01_MyArrayList {
    public static void main(String args[]) {

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("B");//Adding object in arraylist
        myList.add("A");
        myList.add("Z");
        myList.add("C");

        System.out.println("\nPrinting the ArrayList object");
        System.out.println(myList);

        System.out.println("\nIterating ArrayList using Iterator");
        Iterator itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nIterating ArrayList using For-each loop");
        for(String item:myList)
            System.out.println(item);

        System.out.println("\nmyList.get(1) Index:1 \nIt will return the 2nd element, because index starts from 0");
        System.out.println("Returning element: "+myList.get(1));

        System.out.println("\nmyList.set(1,\"M\") Index:1  changing the element");
        myList.set(1,"Y");
        System.out.println(myList);

        System.out.println("\nSorting the list");
        Collections.sort(myList);
        System.out.println(myList);

    }
}
