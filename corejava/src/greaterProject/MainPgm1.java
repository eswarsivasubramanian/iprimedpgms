package greaterProject;
import java.util.Scanner;

public class MainPgm1 implements TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Test tes = new Test();
//		System.out.println("The result is "+tes.check(10, 20));
//		System.out.println();
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("enter first value");
//		int val1 = s.nextInt();
//		
//		System.out.println("enter second value");
//		int val2 = s.nextInt();
//		
//		System.out.println("The greatest is "+tes.check(val1, val2));
		//System.out.println(tes.square(2));
		
//		TestInterface ti = (n) ->  n*n;
//		System.out.println(ti.square(10));
//		TestInterface t1 = (a) -> {
//			if(a%2==0)
//			{
//				//System.out.println("even");
//				return "even";
//			}
//			else
//			{
//				//System.out.println("odd");
//				return "odd";
//			}
//		};
//		System.out.println(t1.oddoreven(5));
		TestInterface t2 = (s) -> s.length();
		System.out.println(t2.lengths("eswar"));
		
	}
}
