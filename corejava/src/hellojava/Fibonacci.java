package hellojava;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,third;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total number of terms");
		int n=s.nextInt();
		System.out.println("The fibonacci series is:");
		System.out.print(first+" "+second+" ");
		//System.out.println(second);
		for(int i=2;i<=n;i++)
		{
			third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
		}
	}

}
