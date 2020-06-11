package com.mimaraslan.queue;

import java.util.*;

public class MyArrayDeque {
    public static void main(String args[]) {

        Deque<String> myDeque = new ArrayDeque<String>();

        myDeque.add("M");
        myDeque.add("E");
        myDeque.add("K");
        myDeque.add("B");
        myDeque.add("A");
        myDeque.add("Z");
        myDeque.add("C");

        System.out.println("\nfor the deque elements:");
        for (String str : myDeque) {
            System.out.println(str);
        }

        System.out.println("\nhead:" + myDeque.element()); // A
        System.out.println("head:" + myDeque.peek()); // A

        System.out.println("\niterating the deque elements:");
        Iterator itr = myDeque.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        myDeque.remove(); // M
        myDeque.poll(); // E

        System.out.println("\nafter removing two elements:");
        Iterator<String> itr2 = myDeque.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println("\nfor the deque elements:");
        for (String str : myDeque) {
            System.out.println(str);
        }

    }
}
