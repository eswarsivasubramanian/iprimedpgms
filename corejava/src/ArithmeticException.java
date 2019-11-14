import java.util.Scanner;
public class ArithmeticException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,flag=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a+b==c)
		{
			System.out.println("Add");
			flag=1;
		}
		
		if(a-b==c)
		{
			System.out.println("Subtract");
			flag=1;
		}
		if(a*b==c)
		{
			System.out.println("Multiply");
			flag=1;
		}
		  if(a/b==c)
		  {
			System.out.println("Divide");
			flag=1;
		  }
		  if(a%b==c)
		  {
			System.out.println("Modulo");
			flag=1;
		  }
		 if(flag==0) 
			System.out.println("Not Possible");	
	}
}
