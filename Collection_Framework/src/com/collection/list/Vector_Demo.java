package com.collection.list;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
	
		Vector v = new Vector();
		System.out.println(v.capacity()); //10
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity()); //20
		v.addElement("A");
		System.out.println(v.capacity()); //20
		System.out.println(v); // [1,2....,10,A]
		

	}

}
