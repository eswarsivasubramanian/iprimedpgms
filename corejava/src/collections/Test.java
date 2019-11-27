package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		package package1;
//
//		import java.util.*;  
//		class TestJavaCollection1
//		{  
////		public static void main(String args[]){  
//		ArrayList list=new ArrayList();//Creating arraylist  
//		list.add("Ravi");
//		list.add("2");//Adding object in arraylist  
//		list.add("Vijay"); 
//		  
//		list.add("Ajay");  
//		list.remove("2");
////	list.remove(2);
////		list.removeAll(list);
////		list.remove("Ravi");
//		//Traversing list through Iterator  
//		Iterator itr=list.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		}  
//		}  
//		
//	}
		//vector 
		
//		Vector v = new Vector();
//		Vector v = new Vector(1000,5);
		Vector v = new Vector();
//		v.add("Eswar");
//		v.add("Shobana");
//		v.add("null");
//		v.add(20);
//		v.addElement(12);
//		int i;
		for (int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		System.out.println(v);
		Enumeration e = v.elements();
		while (e.hasMoreElements())
		{
//			Integer I = (Integer)e.nextElement();
			System.out.println(e.nextElement());
//			if (I%2==0);
//			System.out.println(I);
		}
//		v.remove(1);
//	v.remove(null);
//		v.clear();
//		v.get(1);
//		System.out.println(v.capacity());
//		v.removeAllElements();
		
//		
//		Stack s = new Stack();
//		System.out.println(s.push("Anas"));
//		s.push("Eswar");
//		s.push("Eswar");
//		s.push("Shobana");
//		s.push("Sumitha");
//		
//		System.out.println(s);
//		System.out.println(s.search("Eswar"));
//		System.out.println(s.search("A"));
//		s.push(10);
//		s.add(100);
//		s.peek();
////		empty();
	}

	

}
}
