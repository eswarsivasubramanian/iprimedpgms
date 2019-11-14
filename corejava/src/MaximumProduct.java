

import java.util.Scanner;

public class MaximumProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,max,res,flag=0;;
		
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
		for(i=0;i<n1;i++)
		{
			for(j=i+1;j<n1;j++)
			{
			res=arr[i]*arr[j];
			for(k=0;k<n1;k++)
			{
			if(res==arr[k])
			{
				System.out.println("The result is"+res);
				flag=1;
				break;
			}
			}
			}
		if(flag==1)
			break;
		}
		if(flag==0)
		{
					System.out.println("-1");
		}
		
}
}

