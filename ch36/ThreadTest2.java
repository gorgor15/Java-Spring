package ch36;

//Runnable�� ����
class MyThread1 implements Runnable{
	//�����尡 ����Ǹ� run�� ����ȴ�.
	//�⺻���� normal 
	public void run() {
		int i;
		for(i=1;i<=200;i++) {
			System.out.print(i+"\t");
		}
		
	}
}
public class ThreadTest2 {
	public static void main(String[] args) {
		
		//Runnable�� ����
		
		System.out.println(Thread.currentThread()+"start");
		MyThread1 runnable = new MyThread1();
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread()+"end");
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run");
				
			}
		};
		run.run();
	}
}
