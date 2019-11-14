

import java.util.Scanner;
import java.lang.*;

public class DiceGameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a,b,sum;
				Scanner sc=new Scanner(System.in);
			
				
			    a=sc.nextInt();
			    b=sc.nextInt();
				
				if((a>=0 && a<=6) && (b>=0 && b<=6))
				{ 
					sum=a+b;
					
					if(sum<8)
					{
						System.out.println("THE POINTS SCORED IS "+(8-sum));
					}
					else
					{
						System.out.println("THE POINTS SCORED IS "+2*Math.abs(8-sum));
					}
				}
				else
				{
					System.out.println("INVALID INPUT");
				}

			}

	private static String abs(int i) {
		// TODO Auto-generated method stub
		return null;
	}


}
