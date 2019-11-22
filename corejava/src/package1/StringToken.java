package package1;
import java.util.StringTokenizer;
public class StringToken {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("Hello World","e");
//		System.out.println(st.nextToken());//return one word at a time
//		System.out.println(st.nextToken());
		//System.out.println(st.nextToken());
		System.out.println(st.countTokens());//count the number of words
		//another method to access token
		while(st.hasMoreTokens())//continue until false
			System.out.println(st.nextToken());
		System.out.println(st.countTokens());
	}
}
