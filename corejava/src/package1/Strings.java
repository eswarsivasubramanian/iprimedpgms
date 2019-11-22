package package1;
import java.lang.String;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1=new String("Hello");
//		String str2=new String("World");
//		System.out.println(str1.compareTo(str2));
//		System.out.println(str1.contentEquals(str2));
//		System.out.println(str1.length());
//		System.out.println(str1.equalsIgnoreCase(str1));
//		System.out.println(str1.equalsIgnoreCase(str2));
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.toUpperCase());
//		System.out.println(str2.toUpperCase());
//		
//		//To reverse a string,change to stringbuffer and then pass string variable as argument
//		//chage from stringbuffer to string using tostring()method
//		String sh="FCGDAEB";
//		StringBuffer sb=new StringBuffer(sh);
//		System.out.println(sb.reverse().toString());
		String s="ESWAR";
		StringBuilder sbi=new StringBuilder(s);
		System.out.println(sbi.length());
		System.out.println(sbi.capacity());
		System.out.println(sbi.substring(0, 3));
		System.out.println(sbi.append("."));

	}

}
