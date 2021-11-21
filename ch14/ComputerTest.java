package ch14;

public class ComputerTest {
	public static void main(String[] args) {
		//추상클래스는 new할수없다.
//		Computer computer = new Computer();
		
		
		//추상클래스는 상속하기위해 사용하는 클래스이다.
		Computer computer = new Desktop();
		
		computer.display();
		computer.typing();
		
	}
}
