package hellojava;

import java.util.Scanner;

public class LeapYr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=s.nextInt();
		if(year%4==0 || (year%400==0) && (year%100!=0))
			System.out.println("The given year is a leap year");
		else
			System.out.println("The given year is not  a leap year");
	}

}
