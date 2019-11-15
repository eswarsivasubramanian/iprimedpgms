package hellojava;
import java.util.Scanner;
import java.lang.*;
public class AccBalance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int accbal=1000,dpamount,choice = 0,pin=0,money,deposit = 0;
			String c;
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER YOUR SECRET PIN NUMBER");
			pin=sc.nextInt();
			do
			{
			System.out.println("********Welcome to ATM Service**************");
			System.out.println("1. Check Balance");
		    System.out.println("2. Withdraw Cash");
		    System.out.println("3. Deposit Cash");
		    System.out.println("4. Quit");
		    System.out.println("******************?**************************?*");
		    System.out.println("Enter your choice:");
		    choice=sc.nextInt();
		    switch(choice)
		    {
		    case 1:System.out.println("YOUR BALANCE IN "+accbal);
		           break;
		    case 2:System.out.println("ENTER THE AMOUNT TO WITHDRAW");
		    		money=sc.nextInt();
		    		if(accbal>=money)
		    		{
		    			accbal=accbal-money;
		    			System.out.println("PLEASE COLLECT CASH");
		    			System.out.println("YOUR CURRENT BALANCE: "+accbal);
		    			break;
		    		}
		    		else
		    		{
		    			System.out.println("Insufficient balance");
		    			break;
		    		}
		    case 3:System.out.println("ENTER THE AMOUNT TO DEPOSIT ");
		            deposit=sc.nextInt();
		           accbal=deposit+accbal;
		           System.out.println("YOUR BALANCE "+accbal);
		           break;
		    case 4:System.out.println("THANK U FOR USING ATM");
		            break;
		     
		    }
		    System.out.println("DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n):");
		    c=sc.next();
			}while(c.equals("y"));
			System.out.println("THANK U FOR USING ATM");	
	}
}
