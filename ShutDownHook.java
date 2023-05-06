package Threads;

class closeEvent extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" current thread " + Thread.currentThread().getName());
		super.run();
	}
}

public class ShutDownHook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new closeEvent());
		
		for(int i=1;i<=10;i++) {
			closeEvent t1 = new closeEvent();
			t1.start();
		}
	}

}
