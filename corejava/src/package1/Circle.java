package package1;

public class Circle extends Shape{
	void draw()
	{
		System.out.println("circle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.draw();//also constructor in parent class will be executed
		c.m1();
		Shape c1=new Circle();
		c1.draw();//also constructor in parent class will be executed
		c1.m1();
		//Shape s=new Shape();//Cannot instantiate the type Shape,since shape is abstract class

	}

}
