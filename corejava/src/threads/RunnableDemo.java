package threads;

public class RunnableDemo implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//second way to create a thread
		Cubes c1 = new Cubes();
		Thread t1 = new Thread(c1);
		
		Square s1 = new Square();
		Thread t2 = new Thread(s1);
		
		t1.setPriority(7);
		t2.setPriority(4);
	
		t1.start();
		//t1.join();
		t2.start();
		
		System.out.println(t1.getPriority());//highest priority will be executed first
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");	
	}
}
