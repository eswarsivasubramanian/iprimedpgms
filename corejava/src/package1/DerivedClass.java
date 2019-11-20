package package1;

import java.util.Scanner;

public class DerivedClass extends BaseClass{
	void read_input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the width");
		 width=sc.nextInt();
		 System.out.println("enter the height");
		 height=sc.nextInt();
	}
	void display()
	{
//	   this.width=width;
//	   this.height=height;
//	   System.out.println("width * height = "+(this.width * this.height));
		System.out.println("Width * Height "+(width*height));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass dc=new DerivedClass();
		dc.read_input();
		dc.display();
		

	}

}
