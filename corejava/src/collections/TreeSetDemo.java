package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tree set maintains ascending order and no duplicates
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Eswar");
		ts.add("Siva");
		System.out.println(ts);
		ts.add("Mani");
		System.out.println(ts);
		ts.add("Aaa");
		ts.add("Bbb");
		//ts.add("Mani");
		System.out.println(ts);
		Iterator i = ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		System.out.println(ts.last());
	}
}
