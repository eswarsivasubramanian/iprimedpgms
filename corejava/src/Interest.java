

import java.util.Scanner;
import java.lang.*;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			float dp_amount;
			int r,value,interest,n=0;
			Scanner sc=new Scanner(System.in);
			dp_amount=sc.nextFloat();
			r=sc.nextInt();
			value=sc.nextInt();
			do
			{
				interest=(int) ((dp_amount*r)/100);
				dp_amount=dp_amount+interest;
				n++;
			}while(dp_amount<value);
			System.out.println("years is "+n);			
			}	
	}


