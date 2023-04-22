package bank_process_demo;

public class Withdrawl extends Thread {

	int withd;
	Customer c1;
	
	public Withdrawl(int withd,Customer c1) {

		this.withd=withd;
		this.c1=c1;
	}
	
	@Override
	public void run() {
		c1.withdrwal(withd);
	}
	
}
