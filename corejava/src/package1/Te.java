package package1;
public class Te {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(ArithmeticException.div(10,5));
		//System.out.println(ArithmeticException.div(10,0));
		try
		{
			//AE.div(10,0);
			AE.div(20,4);
			int[] i=new int[] {1,2,3};
			System.out.println(i[1]);//wont be executed if exception occurs before and control transfers to catch block
			String str="Hello World";
			System.out.println(str.charAt(4));
		}
		catch(ArithmeticException e)
		{
			System.out.println("y value should be greater than zero");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index value is more than the size");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		System.out.println("finally block");
	    }
		System.out.println("after try catch block");
	}
}