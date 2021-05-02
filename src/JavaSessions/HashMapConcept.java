package JavaSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//HashMap is a class which implements Map Interface
		//extends AbstractMap
		//it contains only Unique Elements
		//stores the values in the form of key and value pair
		//it may have one null key and multiple null values it can store
		//it maintains no order
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3,"TestComplete");
		hm.put(4, "RFT");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		
		for(Entry m : hm.entrySet()) { //map entry. 
			System.out.println(m.getKey() +" "+ m.getValue());
			hm.remove(3);
			System.out.println(hm);
			
			
			
			
		}
	}

}
