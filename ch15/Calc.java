package ch15;

// 인터페이스는 상속이아니라 구현한다.
public interface Calc {
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1,int num2);
	int subtract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
}
