package ch14;

public class AICar extends Car{

	@Override
	void drive() {
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ �����Դϴ�");
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("�ڵ����� ����ϴ�.");
	}

	@Override
	void wiper() {
		// TODO Auto-generated method stub
		System.out.println("�� ������ �����۰� �۵��մϴ�.");
	}

	@Override
	public void washCar() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ������� �����մϴ�.");
	}
	
}
