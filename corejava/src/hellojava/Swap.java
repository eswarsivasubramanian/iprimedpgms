package hellojava;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("Before Swapping");
		System.out.println("Enter 2 numbers:");
		num1=s.nextInt();
		num2=s.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping:"+num1+" "+num2);
		
	}

}
