

import java.util.Scanner;

public class MaximumProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,max,res;
		
		Scanner sc=new Scanner(System.in);
		 int n1=sc.nextInt();
		 int arr[]=new int[n1];
		for(i=0;i<n1;i++)
		{
			arr[i]=sc.nextInt();	
		}
		max=arr[0];
		for(i=1;i<n1;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];	
			}
		}
		//System.out.println(max);
		for(i=0;i<=n1;i++)
		{
			res=arr[i]*arr[i+1];
			if(res==max)
			{
				System.out.println(res);
				break;
			}
			else if(res!=max)
					System.out.println("-1");
					break;
		}
		
}
}

