package Threads;

class Supportclass extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (Thread.currentThread().isDaemon())
			System.out.println("This is a demon");
		else
			System.out.println("not a demon");
		super.run();
	}
}

public class Daemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supportclass t1 = new Supportclass();
		Supportclass t2 = new Supportclass();

		t1.setDaemon(true);

		t1.start();
		t2.start();

	}

}
