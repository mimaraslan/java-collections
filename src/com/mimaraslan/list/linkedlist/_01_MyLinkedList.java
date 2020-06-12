package com.mimaraslan.list.linkedlist;

import java.util.*;

public class _01_MyLinkedList {
    public static void main(String args[]) {

        LinkedList<String> myList = new LinkedList<String>();
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
