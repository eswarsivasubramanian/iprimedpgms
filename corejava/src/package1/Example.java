package package1;

public interface Example {
	int x=10;
	String color="Red";
	void draw();
	void getArea();
//	void setArea();
//	void fillColor();
	//default method in interface
	default void applyColor()
	{
		System.out.println("color Applied");
	} 
	//static method in interface
	static void displayColor()
	{
		System.out.printf("color Applied is %s",color);
	}

}
