package ch28;

public class MyNumberTest {
	public static void main(String[] args) {
		// ���ٽ�( �Լ��� ���α׷��� )
		MyNumber myNumber = (x,y) -> x>y ?x:y;
		
		System.out.println(myNumber.getMax(10, 25));
	}
}
