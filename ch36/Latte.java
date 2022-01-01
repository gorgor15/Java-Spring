package ch36;

public class Latte extends Decorator{

	//�����ڸ� �߰��ؾߵǴ������� ����Ŭ�������� �⺻�����ڰ� ���⶧���̴�.
	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print("  Adding Latte");
	}
	
}
