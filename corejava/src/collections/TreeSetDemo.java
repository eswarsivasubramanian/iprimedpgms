package collections;
import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tree set maintains ascending order and no duplicates
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Eswar");
		ts.add("Siva");
		//System.out.println(ts);
		ts.add("Mani");
		//System.out.println(ts);
		ts.add("Aaa");
		ts.add("Bbb");
		//ts.add("Mani");
		TreeSet<String> ts1 = new TreeSet<String>(ts);
//		TreeSet<Integer> ts2 = new TreeSet<Integer>(new ComparatorDemo());//sorts in descending order
//		ts2.add(10);
//		ts2.add(5);
//		ts2.add(1);
//		ts2.add(15);
//		System.out.println(ts2);
		TreeSet<String> ts3 = new TreeSet<String>(new ComparatorDemo());
		ts3.add("eswar");
		ts3.add("siva");
		ts3.add("mani");
		ts3.add("hello");
		System.out.println(ts3);
		//System.out.println(ts);
		//System.out.println(ts1);
		//System.out.println(ts.containsAll(ts1));
		Iterator i = ts.iterator();
		while(i.hasNext())
		{
			//System.out.println(i.next());
		}
		//System.out.println();
		//System.out.println(ts.last());
	}
}

