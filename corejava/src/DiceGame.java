

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		int value1,value2;
		Scanner sc=new Scanner(System.in);
	    value1=sc.nextInt();
	    value2=sc.nextInt();
		if((value1>=0 && value1<=6) && (value2>=0 && value2<=6))
		{ 
			if(value1==value2)
			{
				System.out.println("THE POINTS SCORED IS "+2*(value1+value2));
			}
			else
			{
				System.out.println("THE POINTS SCORED IS "+(value1+value2));
			}
		}
		else
		{
			System.out.println("INVALID INPUT");
		}
	}
}