package ch14;

public class ComputerTest {
	public static void main(String[] args) {
		//�߻�Ŭ������ new�Ҽ�����.
//		Computer computer = new Computer();
		
		
		//�߻�Ŭ������ ����ϱ����� ����ϴ� Ŭ�����̴�.
		Computer computer = new Desktop();
		
		computer.display();
		computer.typing();
		
	}
}
