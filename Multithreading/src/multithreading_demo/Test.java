package multithreading_demo;

public class Test {

	public static void main(String[] args) {
		
		NumberG odd=new NumberG(1,100);
	    odd.start();
		odd.setName("Thread1");
		odd.setPriority(7);
		
		try {
			odd.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		NumberG even=new NumberG(2,100);
		even.start();
		even.setName("Thread2");
		even.setPriority(3);
	}
}
