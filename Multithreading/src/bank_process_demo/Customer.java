package bank_process_demo;

public class Customer {

	int amt=10000;
	
	synchronized void withdrwal(int amtw) 
	{
		System.out.println("Withdrawl initiated ...");
		
		if(this.amt<amtw) 
		{
				System.out.println("Insufficient Funds...");
				
				try {
					wait();
				    } 
				catch (InterruptedException e) 
				    {
					e.printStackTrace();
				    }
		}
		
		this.amt-=amtw;
		System.out.println("Withdrawl of "+" = "+amtw+" "+"Success");
	    }
	
	synchronized void deposit(int amtd) 
	{
     System.out.println("Deposit initiated");
     
     this.amt+=amtd;
     
     System.out.println("Deposit of "+ "="+amtd+" "+"success");
     notify();
	}

}