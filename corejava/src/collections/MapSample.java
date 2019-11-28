package collections;

import java.util.*;

public class MapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1,"one");
		tm.put(2,"two");
		tm.put(3,"three");
		tm.put(4,"four");
		tm.put(5,"five");
		System.out.println(tm);
		
//		Set<Map.Entry<Integer, String>> kv = tm.entrySet();
//		for(Map.Entry<Integer,String> i : kv)
//		{
//			if(i.getKey() > 2)
//				System.out.println("key:"+i.getKey()+" value:"+i.getValue());
//		}
		Set<Integer> keyset = tm.keySet();
		System.out.println(keyset);
		
		for(int i : keyset)
			if(i > 2)
			{
				
				System.out.println("key:"+i+" value:"+tm.get(i));
				//System.out.println(tm.get(i));
			}
		//System.out.println(al);
		
		
		
		
	}
}
