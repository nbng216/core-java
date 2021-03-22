package javaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {

		// Using list interface to create arrayList and linkedList.

		List<Integer> arraylist = new ArrayList<Integer>();

		List<Integer> linkedList = new LinkedList<Integer>();

		timeCheck("Arraylist", arraylist);
		timeCheck("LinkedList", linkedList);

	}
	
	
	//populating list.
	public static void timeCheck(String type, List<Integer> list) {

		for (int i = 0; i < 1000; i++) {
			list.add(i);
		}

		long start = System.currentTimeMillis();//recording time
		
		//adding item to end of list
		for(int i = 0;i<50000; i++) {
			list.add(i);
		}
		
		
		//adding items at beginnign of list.
		
		for( int i = 0; i < 1000; i++) {
			list.add(0,i); // here 0 is the index and i is value.
		}
		
		/*
		 * time taken to add element at end of arraylist is faster then linkedlist.
		 * time taken to add element on beginning of linkedlist is faster then arraylist.
		 * time taken to add any element on any other place is faster in linkedlist.
		 */

		long end = System.currentTimeMillis();

		System.out.println("Time taken :" + (end - start) + "for " + type);
	}
}
