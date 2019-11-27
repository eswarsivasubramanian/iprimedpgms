package collections;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashmap 
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "India");
		hm.put(2, "Srilanka");
		hm.put(4, "SouthAfrica");
		System.out.println(hm);
		
		//duplicate values allowed
		hm.put(3, "India");
		System.out.println(hm);
		
		//duplicate keys are not allowed but values will interchange 
		hm.put(2, "Australia");
		hm.put(3, "England");
		System.out.println(hm);
		
		//getting value based on key
		Set<Integer> keyset = hm.keySet();
		System.out.println(keyset);
		
		//receiving all keys
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		
		//retrieving all key,value pairs
		Set<Map.Entry<Integer, String>> kv = hm.entrySet();
		for(Map.Entry<Integer, String> i : kv)
		{
			System.out.println(i.getKey() + ": "+i.getValue());
		}
	}
}
