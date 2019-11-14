package hellojava;

public class hellojava {

	public static void main(String[] args) {
	shape s=new shape();
	s.colour="blue";
	s.edges=10;
	System.out.println(s.colour);
	System.out.println(s.edges);
	circle cl=new circle();
	System.out.println(cl.colour);
	System.out.println(cl.edges);
	System.out.println(cl.get());
	}

}
