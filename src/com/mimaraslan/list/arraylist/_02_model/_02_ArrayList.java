package com.mimaraslan.list.arraylist._02_model;

import java.util.*;

public class _02_ArrayList {

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "B", 23);
		Student s2 = new Student(102, "A", 21);
		Student s3 = new Student(103, "Z", 25);
		Student s4 = new Student(103, "C", 25);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		 
		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}