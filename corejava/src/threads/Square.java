package threads;

public class Square extends Thread {
	public void square() throws InterruptedException
	{
		for(int i=1;i<=10;i++) {
			//Thread.currentThread().setName("square thread");
			//System.out.println(Thread.currentThread().getName()); // thread mumber is 1
			System.out.println("Square of "+i+" is : "+i*i);
			//Thread.sleep(10);
			
		}
		
	}
	public void run()
	{
		try {
			square();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
