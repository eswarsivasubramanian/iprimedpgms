package threads;
public class ThreadDemo extends Thread{
//	public void run()
//	{
//		for(int i=0;i<10;i++)
//		{
//		System.out.println("Inside run");
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//	}
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
//		ThreadDemo t1 = new ThreadDemo();
//		ThreadDemo t2 = new ThreadDemo();
//		
//		t1.start(); //calls run method
//		t2.start(); //calls run method
//		
//		for(int j=0;j<10;j++)
//	{
//		
//			System.out.println("Inside main");
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//one method
//		Cubes c = new Cubes();
//		Square s = new Square();
//		c.cubes();
//		s.square();
		
		Cubes c1 = new Cubes();
		Square s1 = new Square();
		//start thread
		c1.start(); 
		s1.start();
		System.out.println(Thread.activeCount()); //
		
		c1.join(); //makes main wait until c1 and s1 completes
		s1.join(); //makes main wait until c1 and s1 completes
		
		for(int j=1;j<=10;j++)
		{
				System.out.println("j value is: "+j);
				//System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().isAlive());
				System.out.println(Thread.currentThread().getPriority()); //5
				System.out.println(Thread.currentThread().MAX_PRIORITY); //10
				System.out.println(Thread.currentThread().getId());
				System.out.println(Thread.currentThread().MIN_PRIORITY); // 1
				System.out.println(Thread.currentThread().NORM_PRIORITY); //5
				Thread.currentThread().setPriority(8);
				System.out.println(Thread.currentThread().getPriority()); //8
				Thread.sleep(10);
				System.out.println();
		}	
	}
}
