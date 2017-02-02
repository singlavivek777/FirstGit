package com.collection.set;


import java.util.TreeSet;

public class TreeSet_Demo {
	public static void main(String[] args) {
	
		TreeSet h = new TreeSet();
		h.add("A");
		h.add("a");
		h.add("B");
		h.add("Z");
		h.add("L");
		//h.add(new Integer(10)); // ClassCastExeption
		//h.add(null); // null pointer exception
		System.out.println(h);  //[A,B,L,Z,a]
	}
}
