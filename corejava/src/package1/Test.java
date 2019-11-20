package package1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapStudent e1=new EncapStudent("Anas", 3, "Delhi");//goes for EncapStudent class
		System.out.println("Name: "+e1.getName());
		System.out.println("Roll No: "+e1.getRollno());
		System.out.println("City: "+e1.getCity());
		e1.setCity("Bihar");//used to call in another class
		System.out.println("City: "+e1.getCity());
	}

}
