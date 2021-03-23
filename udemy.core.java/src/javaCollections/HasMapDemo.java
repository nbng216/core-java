package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> id = new HashMap<Integer, String>();

		id.put(1, "nabing");
		id.put(2, "Hira");
		id.put(3, "Madhab");
		id.put(4, "Keahab");
		
		for(Map.Entry<Integer,String> name: id.entrySet())
		
		System.out.println(name.getKey()+" : "+name.getValue());

		
		
	}
}
	
	