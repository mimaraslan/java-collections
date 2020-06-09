package com.mimaraslan.list;

import java.util.*;

class _01_MyArrayList {
    public static void main(String args[]) {

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("B");//Adding object in arraylist
        myList.add("A");
        myList.add("Z");
        myList.add("C");

        Iterator itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
