package collections;
import java.util.*;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(25);
		al.add(30);
		System.out.println("before reverse");
		System.out.println(al);
		Collections.reverse(al);
		System.out.println("after reverse");
		System.out.println(al);
	}
}
