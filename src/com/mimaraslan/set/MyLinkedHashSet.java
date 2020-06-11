package com.mimaraslan.set;

import java.util.*;

public class MyLinkedHashSet {
    public static void main(String args[]) {

        LinkedHashSet<String> mySet=new LinkedHashSet<String>();
        mySet.add("B");
        mySet.add("A");
        mySet.add("Z");
        mySet.add("Z");
        mySet.add("A");
        mySet.add("A");
        mySet.add("C");

        Iterator<String> itr = mySet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
