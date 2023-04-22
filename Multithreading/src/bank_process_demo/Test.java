package bank_process_demo;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		Customer c=new Customer();
		
		Withdrawl T1=new Withdrawl(15000, c);
		
		Deposit T2=new Deposit(5000, c);
		
		T1.start();
		Thread.sleep(5000);
		T2.start();
	}
}
