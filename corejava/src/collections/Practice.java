package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		int sum=0;
	for(int itr=1;itr<=100;itr++)
		{
			al.add(itr);
		}
			Iterator<Integer> it = al.iterator();
			while(it.hasNext())
			{
				int var=it.next();
				if(var%2==0)
			 		sum+=var;
			}	
		//System.out.println(al);
		System.out.println("The sum of even numbers in first 100 numbers is: "+sum);
	}
}
