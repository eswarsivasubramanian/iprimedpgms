package hellojava;

import java.util.Scanner;


	public class Calendar
	{ 
		public static void main(String[] args) 
		{ 
		Scanner in = new Scanner(System.in);
		System.out.println("enter year");
		int year = in.nextInt();
		if(year < 1918)
		{ 
			if(year%4==0)
			System.out.println("12.09."+year);
		else
			System.out.println("13.09."+year);
		} 
		else if(year > 1918)
		{
			if(year%400 == 0 || (year%4==0 && year%100 != 0)) 
				System.out.println("12.09."+year);
		    else
			System.out.println("13.09."+year);
			}
		else if (year == 1918)
		{ 
			System.out.println("26.09.1918");
			}
		}
		}