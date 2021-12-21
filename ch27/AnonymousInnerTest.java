package ch27;


class Outer2{
	int outNum=100;
	static int sNum=200;
	Runnable getRunnable(int i) {
		// int i 와 num 은 스택 메모리에 생성 
		
		int num=10;
		// 클래스 이름을 없애고 return을 바로 하는 클래스를 익명클래스
		return new Runnable(){
			int localNum = 1000;
			@Override
			public void run() {
				// 언제 불릴지 모르고 상수화가 되어있어서 지역변수의 값을 변경할수없다.
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				
				System.out.println("outNUm="+outNum+"(외부 클래스인스턴스 변수)");
				System.out.println("Outter.sNum = "+Outer2.sNum+"(외부 클래스 정적 변수)");
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
