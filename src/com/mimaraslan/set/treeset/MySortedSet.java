package com.mimaraslan.set.treeset;

import java.util.*;

public class MySortedSet {
    public static void main(String args[]) {

        SortedSet<String> mySet = new TreeSet();
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
