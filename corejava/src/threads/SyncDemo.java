package threads;

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		MyThread t1 = new MyThread(d,"Sai");
		MyThread t2 = new MyThread(d,"Suresh");
		MyThread t3 = new MyThread(d,"Kumar");
		MyThread t4 = new MyThread(d,"Ram");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
