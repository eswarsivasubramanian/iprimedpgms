package package1;

public class ClassB extends ClassA {
	void m3()
	{
		System.out.println("m3 method");
	}
	void m4()
	{
		System.out.println("m4 method");
	}
	private void m1()
	{
		System.out.println("child m1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB c2=new ClassB();
		c2.m1();//in classB method
		c2.m2();
		c2.m3();
		c2.m4();
		m1();//Cannot make a static reference to the non-static method m1() from the type ClassB


	}

}
