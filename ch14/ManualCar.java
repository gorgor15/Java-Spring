package ch14;

public class ManualCar extends Car{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("��ֹ� �տ��� �극��ũ�� ��Ƽ� ����ϴ�.");
	}

	@Override
	void wiper() {
		// TODO Auto-generated method stub
		System.out.println("�񰡿ͼ� �����۸� �۵���ŵ�ϴ�.");
	}
	
}
