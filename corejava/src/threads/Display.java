package threads;

public class Display {
	//only one thread will execute at a time 
	synchronized void greet(String s) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("Hello "+ s);
		//Thread.sleep(10);
		}
	}
	
}
