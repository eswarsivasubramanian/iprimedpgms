package package1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex=new Rectangle();
		ex.draw();
		ex.getArea();
		System.out.println(ex.x);//x is final by default
		System.out.println(Example.x);// x is also static by default,so we use class name to access the variable
		ex.applyColor();
		Example.displayColor();
	}

}
