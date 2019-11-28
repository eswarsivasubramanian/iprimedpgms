package collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//treemap - sorted order of keys
		TreeMap<Integer,String>  tm = new TreeMap<Integer,String>();
		tm.put(1,"ravi");
		tm.put(5,"suresh");
		tm.put(2,"gopal");
		tm.put(6,"ravi");
		System.out.println(tm);
		

	}

}
