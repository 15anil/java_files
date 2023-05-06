package Threads;
class Tpriority extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("THREAD NAME:- " + Thread.currentThread().getName()  +  " "
					+ " THREAD PRIORITY:-  " + Thread.currentThread().getPriority());
		}
		super.run();
	}
}

public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Tpriority t1 = new Tpriority();
		Tpriority t2 = new Tpriority();
		Tpriority t3 = new Tpriority();
		
		t1.setName("first thread");
		t2.setName("second thread");
		t3.setName("third thread");
		t1.start();
		t1.join(10);
		System.out.println(t1.getState());
		t2.start();
		t2.join();
		System.out.println(t2.getState());
		t3.start();
		t3.join();
		
		

	}

}
