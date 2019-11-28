package collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String i1 = (String)arg0;
		String i2 = (String)arg1;
		/*if(i1.compareTo(i2))
			i1.
			return 1;
		else if(i1 > i2)
			return -1;
		else
			return 0;
		*/
		return(i2.compareTo(i1));
	}
}
