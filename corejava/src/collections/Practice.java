package collections;
import java.util.ArrayList;
public class Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		int sum=0;
		for(int itr=1;itr<=100;itr++)
		{
			al.add(itr);
			//System.out.println(al);
			if(itr%2==0)
			{
				sum+=itr;
			}
		}
		System.out.println(al);
		System.out.println(sum);
	}
}
