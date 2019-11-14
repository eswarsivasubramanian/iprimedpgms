

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z,sum;
		double res,tot;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		sum=(y*4)+(z*6);
		System.out.println(sum);
		tot=x-sum;
		System.out.println(tot);
	    res=(tot/x)*100;
		System.out.println("The average is  "+String.format("%.2f",res));
}
}
