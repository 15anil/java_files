package Threads;

class Demo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread name :- " +Thread.currentThread().getName());
		
	}
	
}

public class ThreadgroupConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup parent = new ThreadGroup("parent group");
		ThreadGroup child = new ThreadGroup("parent group");
		
		Thread t1 = new Thread(parent,new Demo(),"first");
		Thread t2 = new Thread(parent,new Demo(),"second");
		Thread t3 = new Thread(child,new Demo(),"third");
		
		System.out.println("active group of threads:- " + parent.activeCount());
		
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("active group of threads:- " + parent.activeCount());
//		t1.run();
		System.out.println("child group of threads:- " + child.activeCount());
		
		
		

	}

}
