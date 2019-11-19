package hellojava;
class Instance
{
	int number;
	int getNumber(int num)
	{
		System.out.println("In instance method");
		number=num;
		return number;
	}	
}
public class Name
{
	static String s="";
	public static void getName(String name)
	{
		System.out.println("In static method");
		s=name;
		System.out.println(s);
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Instance ins=new Instance();
	System.out.println(ins.getNumber(100));	
	Name.getName("Eswar");
	}
}


