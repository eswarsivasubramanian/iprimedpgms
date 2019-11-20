package package1;

public abstract class Shape {
	
	Shape()
	{
		System.out.println("shape constructor");
	}
	abstract void draw();
	public void m1()
	{
		System.out.println("inside m1 method");
	}
/*  concrete class -  class in which all methods are defined
    cannot override final method in child class   */
}
