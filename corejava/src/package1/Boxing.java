package package1;
import java.util.ArrayList; 
import java.util.Iterator;
public class Boxing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10;
		//Integer n2=n1;
		//Integer n2=Integer.valueOf(n1);//Autoboxing
		//System.out.println(n2);
		//int n3=n2;
		//int n3=n2.intValue();//Autounboxing
		//System.out.println(n3);
		
		//ArrayList
		ArrayList al=new ArrayList();
		al.add(20);
		al.add("Eswar");
		al.add(null);
		al.add(true);
		System.out.println(al);
		
		//Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		//using for loop
		System.out.println("using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//empty arraylist
		ArrayList al1=new ArrayList();
		Iterator itr1=al1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
