package multithreading_demo;

import java.util.Iterator;

public class NumberG extends Thread {

	int st;
	int end;
	
	public NumberG(int st, int end) {
		super();
		this.st = st;
		this.end = end;
	}
	
	@Override
	public void run() {
		
		for (int i = st; i <= end; i++) {
			System.out.println(i+ " " + currentThread().getName()+" "+currentThread().getPriority());
			i++;
		}
	}
	
	
}
