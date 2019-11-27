package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Linked hash set - no duplicates
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add(10);
		lhs1.add(20);
		System.out.println(lhs1);
		System.out.println(lhs1.contains(10));
		lhs1.add(30);
		lhs1.add(40);
		lhs1.add(5);
		lhs1.add(10);
		System.out.println(lhs1);
		Iterator it = lhs1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
