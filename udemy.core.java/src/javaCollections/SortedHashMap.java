package javaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedHashMap {
	public static void main(String[] args) {

		// This is normal hashmap. It doesn't print key:value in order.
		Map<Integer, String> hasMap = new HashMap<Integer, String>();

		// LinkedHashMap print the key:value in the order user has set them.
		Map<Integer, String> linkedHasMap = new LinkedHashMap<Integer, String>();

		// TreeMap prints key:value in sorted key order.ascending
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		SortedMapTest(hasMap);
		SortedMapTest(linkedHasMap);
		SortedMapTest(treeMap);

	}

	public static void SortedMapTest(Map<Integer, String> testMap) {
		
		testMap.put(2, "Titanic");
		testMap.put(3, "Avatar");
		testMap.put(1, "Lion king");
		testMap.put(4, "Good fella");
		
		//iterating over mmap
	for(Integer key:testMap.keySet()) {
		String value = testMap.get(key);
			
			System.out.println(key+": "+value);
		}

	}

}
