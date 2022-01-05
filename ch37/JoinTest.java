package ch37;

public class JoinTest extends Thread{

	int start;
	int end;
	int total;
	public JoinTest(int start, int end) {
		this.start=start;
		this.end=end;
	}
	
	public void run() {
		int i;
		for(i=start;i<=end;i++) {
			total+=i;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		JoinTest test1 = new JoinTest(1, 50);
		JoinTest test2 = new JoinTest(51, 100);
		
		test1.start();
		test2.start();
		
		test1.join();
		test2.join();
		
		int lastTotal = test1.total + test2.total;
		
		System.out.println("test1.total ="+ test1.total);
		System.out.println("test2.total ="+ test2.total);
		System.out.println("lastTotal ="+ lastTotal);
	}
}
