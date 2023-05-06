package Threads;

import Wiley_java.BankAccount;

class Bankaccount{
	int amount = 1000;
	public synchronized void withdraw(int amount) {
		if(this.amount<amount) {
			System.out.println("Amount is less");
		}
		try {
			wait();
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Amount withdrawn is succesful");
	}
	public synchronized void depositamount(int amount) {
		this.amount += amount;
		System.out.println("amount deposited");
		notify();//methods of threads
	}
	
}


public class InterCommunication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
			
		
		Thread t1 = new Thread() {
			public void run() {
				
			};
		};
		t1.start();
		
	}

}
