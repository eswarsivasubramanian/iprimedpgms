package hellojava;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter table number");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}

	}

}
