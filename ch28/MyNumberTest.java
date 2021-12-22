package ch28;

public class MyNumberTest {
	public static void main(String[] args) {
		// 람다식( 함수형 프로그래밍 )
		MyNumber myNumber = (x,y) -> x>y ?x:y;
		
		System.out.println(myNumber.getMax(10, 25));
	}
}
