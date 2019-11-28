package collections;
import java.util.*;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//linked hashmap - insertion order maintained
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		lhm.put("Chennai",600091);
		lhm.put("Hyderabad",452878);
		lhm.put("Cochin", 257848);
		System.out.println(lhm);
		//Get keys
		System.out.println("keys: "+lhm.keySet());
		
		//get value using keys
		System.out.println("Chennai pin code: "+lhm.get("Chennai"));
		
		//retrieving all key,value pairs
				Set<Map.Entry<String,Integer>> kv = lhm.entrySet();
				for(Map.Entry<String,Integer> i : kv)
				{
					System.out.println(i.getKey() + ": "+i.getValue());
				}
	}
}
