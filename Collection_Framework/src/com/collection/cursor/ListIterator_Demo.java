package com.collection.cursor;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_Demo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("ram");
		l.add("shyam");
		l.add("praveen");
		l.add("ramesh");
		System.out.println(l); // [ram shyam praveen ramesh]
		
		ListIterator itr = l.listIterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			if(s.equals("shyam"))
			{
				itr.remove();
			}
			
			else if(s.equals("ramesh"))
			{
				itr.add("suresh");
			}
			else if(s.equals("praveen"))
			{
				itr.set("test");
			}
		}
		
		System.out.println(l);//[ram test ramesh suresh]
	}

}
