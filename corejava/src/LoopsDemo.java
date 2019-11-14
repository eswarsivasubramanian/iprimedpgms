
public class LoopsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("normal for loop");
		for(x=0;x<9;x++)
		{
			System.out.println(x);
		}
		System.out.println("for loop in array intialization");
		int y[]=new int[4];
		for(int i=0;i<y.length;i++)
		{
			y[i]=x;
			x++;
			System.out.println(y[i]);
		}
		System.out.println("enhanced for loop");
		for(int j:y)
			System.out.println(j);
		System.out.println("string array using enhanced for loop");
		String str[]= {"red","blue","green","orange"};
		for(String s:str)
			System.out.println(s);
		System.out.println("enhanced for loop in 2d arrays");
		int z[][]= {{1,2},{3,4}};
		for(int u[]:z)
		{
			for(int v:u)
				System.out.println(v);
		}
		
	}

}
