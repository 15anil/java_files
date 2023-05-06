package Threads;

class Parent{
	public void m1() {
		System.out.println("this is m1 methods");
	}
}
class T1 extends Thread{
	public void run() {
		System.out.println("by thread class");
	}
}
class T2 extends Parent implements Runnable{
	public void run() {
		m1();
		System.out.println("by using runnable Interface");
	}
}


public class Threadprocess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t1 = new T1();
		t1.start();
		
		T2 t2 = new T2();
		Thread trd = new Thread(t2);
		trd.run();

	}

}
