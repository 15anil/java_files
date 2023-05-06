package Threads;

public class Deadlock {
	public static Object Lock1 = new Object();

	public static Object Lock2 = new Object();
	
	private static class LockThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized(Lock1) {
				System.out.println("Thread one hold: Lock1");
			}
			try {
				Thread.sleep(6000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			super.run();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LockThread l1 = new LockThread();
		l1.run();
		LockThread l2 = new LockThread();
		l2.run();
	}

}
