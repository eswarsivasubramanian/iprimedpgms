package package1;
public class EncapStudent {
	private int rollno;
	private String name;
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	EncapStudent(String n,int rollno,String city)
	{
		name=n;
		this.rollno=rollno;
		this.city=city;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapStudent es=new EncapStudent("Eswar",1,"Chennai");
		EncapStudent es1=new EncapStudent("Siva",2,"Chennai");
		/*es.setName("Eswar");
		es.setRollno(1);
		es.setCity("Chennai");*/
		System.out.println("Name: "+es.getName());
		System.out.println("Roll No: "+es.getRollno());
		System.out.println("City: "+es.getCity());
		System.out.println("Name: "+es1.getName());
		System.out.println("Roll No: "+es1.getRollno());
		System.out.println("City: "+es1.getCity());
	}
}
