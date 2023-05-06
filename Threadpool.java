package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Pool extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread name :- " + Thread.currentThread().getName());
		super.run();
	}
}

public class Threadpool {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		ExecutorService exe = Executors.newFixedThreadPool(0);
//		for (int i = 1; i <= 10; i++) {
//			exe.execute(new Pool());
//		}
//		exe
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
		executor.scheduleWithFixedDelay(new Pool(), 5, 2, TimeUnit.SECONDS);

	}

}
