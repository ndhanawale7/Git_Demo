package bank_process_demo;

public class Deposit extends Thread {

	int dep;
	Customer c2;
	
	public Deposit (int dep, Customer c2) 
	{
		super();
		this.dep = dep;
		this.c2 = c2;
	}
	
	@Override
	public void run() {
		c2.deposit(dep);
	}
	
	
	
	
}
