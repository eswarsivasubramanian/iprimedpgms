package hellojava;

import java.util.Scanner;
import java.lang.*;
public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		number=s.nextInt();
		if(number%2==0)
			System.out.println("The given number is Even");
		else
			System.out.println("The given number is Odd");
		

	}

}
