package package1;

public class StaticEg {
	int a=10;
	int b=20;
	static String name;
	static int c=10;
	static int d=20;
	StaticEg()
	{
		System.out.println("Inside constructor");
	}
	//static block
	static
	{
		name="Eswar";
	System.out.println("Name is: "+name);
		System.out.println("Inside static block");
		System.out.println("Multiplication result: "+c*d);
	}
	//instance block
	{
		System.out.println("Inside instance");
		System.out.println("Addition result: "+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main");
		StaticEg se=new StaticEg();
		
		

	}

}
