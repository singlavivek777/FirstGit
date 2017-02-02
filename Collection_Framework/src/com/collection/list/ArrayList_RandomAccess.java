package com.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayList_RandomAccess {

	public static void main(String[] args) {
	ArrayList l1 = new ArrayList();
	
	LinkedList l2 = new LinkedList();
	
     System.out.println(l1 instanceof RandomAccess);
     
     System.out.println(l2 instanceof RandomAccess);
	}
	
}

