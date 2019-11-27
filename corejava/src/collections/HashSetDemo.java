package collections;
import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hash set
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Eswar");
		hs.add("Siva");
		hs.add("Mani");
		hs.add("Eswar");
		
		//No insertion order and no duplicates
		
		System.out.println(hs);
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Anas");
		hs1.add("Rizvi");
		System.out.println(hs1);
		System.out.println(hs.size());
		System.out.println(hs.contains("Eswar"));
		HashSet hs2 = hs1;
		System.out.println(hs2.equals(hs1));
		System.out.println(hs2.containsAll(hs1));
		Object[] str = hs.toArray();
		System.out.println();
		System.out.println(hs);
	    for(Object s : str)
	    {
	    	System.out.println(s);
	    }
	    System.out.println();
	
		//System.out.println(str[0]);
//		System.out.println(str[1]);
//		System.out.println(str[2]);
	    System.out.println("Hash codes");
		System.out.println(hs.hashCode());
		System.out.println(hs1.hashCode());
		System.out.println(hs2.hashCode());
		System.out.println();
		System.out.println("Iterator");
		Iterator itr = hs1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
