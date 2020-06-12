package com.mimaraslan.set.hashset;

import java.util.*;

public class MyHashSet {
    public static void main(String args[]) {

        HashSet<String> mySet = new HashSet<String>();
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
