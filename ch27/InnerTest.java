package ch27;

import ch27.OutClass.InStaticClass;

class OutClass{
	private int num=10;
	private static int sNum =20;
	private InnerClass innerClass;
	
	public OutClass() {
		innerClass = new InnerClass();
	}
	private class InnerClass{
		int iNum=100;
		
		void inTest() {
			System.out.println("OutClass num = "+num+ "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+ "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = "+iNum+ "(내부 클래스의 인스턴스 변수)");
		}
	}
	public void usingClass() {
		innerClass.inTest();
	}
	
	static class InStaticClass{
		int iNum=1000;
		static int sInNum=200;
		
		void inTest() {
			System.out.println("InClass iNum = "+iNum+ "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+ "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sInNum = "+sInNum+ "(내부 클래스의 인스턴스 변수)");
		}
		static void sTest() {
			System.out.println("OutClass sNum = "+sNum+ "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sInNum = "+sInNum+ "(내부 클래스의 스태틱 변수)");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		/*
		OutClass outClass = new OutClass();
		outClass.usingClass();
		*/
		//Private가 아닌경우 내부에서도 생성할수있다
		//OutClass.InnerClass inner = outClass.new InnerClass();
		//inner.inTest();
		
		OutClass.InStaticClass staticClass = new OutClass.InStaticClass();
		staticClass.inTest();
		System.out.println("================");
		OutClass.InStaticClass.sTest();
		
	}
}
