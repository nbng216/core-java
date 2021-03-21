package javaCollections;

import java.util.ArrayList;

public class array {
	
	public static void main(String[] args) {
		
		//creating new array list with string data type
		
		ArrayList<String> names = new ArrayList<String>();
		
		
		//adding values to arraylist.
		names.add("Nabin");
		names.add("Madhab");
		names.add("Bale");
		names.add("Keshab");
		
		//using enhanced for loop to print values of arraylist.
		
		for(String values:names) {
			System.out.println(values);
			
		}
		
		System.out.println("_____________________________________________");
		
		//using simple for loop to print value of arraylisst.
		
		for(int i = 0; i < names.size();i++) {
			//System.out.println(names); //this will print names 4 times
			
			//System.out.println(i); //this will print 0,1,2,3,4
			
			//correct code
			System.out.println(names.get(i));
		}
		System.out.println("_____________________________________________");
		
		//removing item for arraylist.
		
		names.remove(0);//this will remove Nabin from name.
		
		for(int i = 0; i < names.size();i++) {
			System.out.println(names.get(i));
			
		}
			
		
	}

}
