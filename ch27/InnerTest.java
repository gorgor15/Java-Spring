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
			System.out.println("OutClass num = "+num+ "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = "+sNum+ "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = "+iNum+ "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	public void usingClass() {
		innerClass.inTest();
	}
	
	static class InStaticClass{
		int iNum=1000;
		static int sInNum=200;
		
		void inTest() {
			System.out.println("InClass iNum = "+iNum+ "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = "+sNum+ "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass sInNum = "+sInNum+ "(���� Ŭ������ �ν��Ͻ� ����)");
		}
		static void sTest() {
			System.out.println("OutClass sNum = "+sNum+ "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass sInNum = "+sInNum+ "(���� Ŭ������ ����ƽ ����)");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		/*
		OutClass outClass = new OutClass();
		outClass.usingClass();
		*/
		//Private�� �ƴѰ�� ���ο����� �����Ҽ��ִ�
		//OutClass.InnerClass inner = outClass.new InnerClass();
		//inner.inTest();
		
		OutClass.InStaticClass staticClass = new OutClass.InStaticClass();
		staticClass.inTest();
		System.out.println("================");
		OutClass.InStaticClass.sTest();
		
	}
}
