package ch36;

class MyThread extends Thread{
	//�����尡 ����Ǹ� run�� ����ȴ�.
	//�⺻���� normal 
	public void run() {
		int i;
		for(i=1;i<=200;i++) {
			System.out.print(i+"\t");
		}
		
	}
}
public class ThreadTest {
	public static void main(String[] args) {
		
		//Thread�� 3�� ���ư���
		System.out.println(Thread.currentThread()+"start");
		MyThread thread = new MyThread();
		MyThread thread2 = new MyThread();
		thread.start();
		thread2.start();
		System.out.println(Thread.currentThread()+"end");
	}
}
