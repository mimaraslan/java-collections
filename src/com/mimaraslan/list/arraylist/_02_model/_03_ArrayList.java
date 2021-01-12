package com.mimaraslan.list.arraylist._02_model;

import java.io.*;
import java.util.*;

public class _03_ArrayList {

	public static void main(String[] args) {
/*
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
*/
		
		   ArrayList<String> al=new ArrayList<String>();  
	          al.add("A");    
	          al.add("C");    
	          al.add("Z"); 
		
		
		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();

			// Deserialization
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList) ois.readObject();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}