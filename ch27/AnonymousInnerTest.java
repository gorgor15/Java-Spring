package ch27;


class Outer2{
	int outNum=100;
	static int sNum=200;
	Runnable getRunnable(int i) {
		// int i �� num �� ���� �޸𸮿� ���� 
		
		int num=10;
		// Ŭ���� �̸��� ���ְ� return�� �ٷ� �ϴ� Ŭ������ �͸�Ŭ����
		return new Runnable(){
			int localNum = 1000;
			@Override
			public void run() {
				// ���� �Ҹ��� �𸣰� ���ȭ�� �Ǿ��־ ���������� ���� �����Ҽ�����.
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				
				System.out.println("outNUm="+outNum+"(�ܺ� Ŭ�����ν��Ͻ� ����)");
				System.out.println("Outter.sNum = "+Outer2.sNum+"(�ܺ� Ŭ���� ���� ����)");
			}
			
		};
		
	}
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable class");
		}
	};
}
public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		Runnable runner =outer2.getRunnable(100);
		runner.run();
		
		outer2.runnable.run();
	}
}
