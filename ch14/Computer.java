package ch14;

public abstract class Computer {
	
	//�� Ŭ�������� �����������ϴ� ��ӹ޴� Ŭ�������� �˾Ƽ� �����ض�
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
	System.out.println("������ �մϴ�.");	
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
