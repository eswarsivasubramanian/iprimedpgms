package greaterProject;

public class Test //implements TestInterface {

	@Override
	public int check(int val1, int val2) {
		// TODO Auto-generated method stub
		if(val1 > val2)
		{
			return val1;
		}
		else
		{
			return val2;
		}
		//return val1>val2 ? val1 : val2;
	}
//		public int square(int n)
//	{
//			return n*n;	
//	}
		 //(n) -> n*n; //valid
		//(n) ->{ return n*n;} //valid
		//(n) -> return n*n //invalid

	
	
	}

