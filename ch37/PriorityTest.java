package ch37;

class PriorityThread extends Thread{
	public void run() {
		int sum=0;
		Thread t = currentThread();
		System.out.println(t+"start");
		for(int i=0;i<=1000000000;i++) {
			sum+=i;
		}
		System.out.println(t.getPriority()+ "end");
	}
}


public class PriorityTest {
	public static void main(String[] args) {
		int i;
		for(i=Thread.MIN_PRIORITY;i<=Thread.MAX_PRIORITY;i++) {
			PriorityThread thread = new PriorityThread();
			thread.setPriority(i);
			thread.start();
		}
	}
}
