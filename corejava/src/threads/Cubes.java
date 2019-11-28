package threads;

public class Cubes extends Thread  {
	public void cubes() throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			Thread.currentThread().setName("cube thread");
			System.out.println(Thread.currentThread().getName());  // thread number is 0
			System.out.println("cube of "+i+" is : "+i*i*i);
			Thread.sleep(10);
		}
	}

	public void run()
	{
		try {
			cubes();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
