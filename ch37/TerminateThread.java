package ch37;

import java.io.IOException;

public class TerminateThread extends Thread{
	
	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public void run() {
		
		while(!flag) {
			try {
				sleep(100);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(getName()+" end");
	}
	
	public static void main(String[] args) throws IOException {
		
		TerminateThread t1 = new TerminateThread("A");
		TerminateThread t2 = new TerminateThread("B");
		TerminateThread t3 = new TerminateThread("C");
		
		t1.start();
		t2.start();
		t3.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if(in=='A') {
				t1.setFlag(true);
			}else if(in=='B') {
				t2.setFlag(true);
			}else if(in=='C') {
				t3.setFlag(true);
			}else if(in=='M') {
				t1.setFlag(true);
				t2.setFlag(true);
				t3.setFlag(true);
				break;
			}else {
				System.out.println("Type again");
			}
		}
		System.out.println("main end");
	}
}
