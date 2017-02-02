package com.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
	 
		LinkedList l = new LinkedList();
		l.add("vivek");
		l.add(30);
		l.add(null);
		l.add("vivek");
		l.set(0, "software");
		l.add(0, "ramesh");
		l.addFirst("test");
	
		System.out.println(l); // [test,ramesh,software,30, null,vivek]
	}
	}


