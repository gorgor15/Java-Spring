package ch36;

class MyThread extends Thread{
	//쓰레드가 수행되면 run이 실행된다.
	//기본값은 normal 
	public void run() {
		int i;
		for(i=1;i<=200;i++) {
			System.out.print(i+"\t");
		}
		
	}
}
public class ThreadTest {
	public static void main(String[] args) {
		
		//Thread가 3개 돌아간것
		System.out.println(Thread.currentThread()+"start");
		MyThread thread = new MyThread();
		MyThread thread2 = new MyThread();
		thread.start();
		thread2.start();
		System.out.println(Thread.currentThread()+"end");
	}
}
