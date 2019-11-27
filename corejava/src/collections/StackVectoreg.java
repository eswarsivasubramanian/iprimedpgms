package collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
public class StackVectoreg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stack 
		//System.out.println("Stack");
		Stack s = new Stack();
		s.push("Eswar");
		s.push("Anas");
		s.push("Shyam");
		s.push("Ram");
		s.push("Ravi");
	//System.out.println(s);
//		System.out.println(s.pop());
//		System.out.println(s.peek());
//		System.out.println(s.search("Eswar"));
		Iterator it=s.iterator();
		//while(it.hasNext())
		//{
			//System.out.print(it.next());
		//}
		ListIterator itr =  s.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		System.out.println();
		
		//vector
//		System.out.println();
//		System.out.println("Vector");
//		Vector v=new Vector();
//		Vector v2=new Vector();
//		Vector v1=v;
//		v.add("Eswar");
//		v.add("Siva");
//		v.add("Mani");
		//System.out.println(v);
		//v.add(0,"Subramani");
//		System.out.println(v);
//		System.out.println(v.capacity());
//		System.out.println(v.contains("E"));
//		System.out.println(v.elementAt(3));
//		System.out.println(v.get(1));
		//v.remove("Subramani");
//		System.out.println(v);
//		System.out.println(v1);
		//System.out.println(v == v1);.
//		v2.add("A");
//		v2.add("B");
//		v2.add("C");
//		v2.add("Eswar1");
//		v1.addAll(v2);
//		System.out.println(v1);
//	//v1.removeAll(v2);
//	System.out.println(v1);
//	v1.retainAll(v2);
//		System.out.println(v1);
	}	
}
