package com.mimaraslan.list;

import java.util.*;

public class _04_MyStack {
    public static void main(String args[]) {

        Stack<String> myList = new Stack<String>();
        myList.push("B");
        myList.add("A");
        myList.push("Z");
        myList.add("C");

        Iterator<String> itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
