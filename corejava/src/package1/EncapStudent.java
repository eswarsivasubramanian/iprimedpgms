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

	/*EncapStudent()
	{
		System.out.println("constructor for student");
	}*/

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
		EncapStudent es=new EncapStudent();
		es.setName("Eswar");
		es.setRollno(1);
		es.setCity("Chennai");
		System.out.println("Name: "+es.getName());
		System.out.println("Roll No: "+es.getRollno());
		System.out.println("City: "+es.getCity());

	}

	
}
