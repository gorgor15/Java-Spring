package ch14;

public abstract class Car {
	abstract void drive();
	abstract void stop();
	abstract void wiper();
	public void startCar() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {}
	// ���ϸ� �ȵȴ�. final�� �����ϸ� ��ӹ޴� Ŭ�������� �����Ǹ� �Ҽ�����.
	final public void run() {
		startCar();
		drive();
		wiper();
		washCar();
		stop();
		turnOff();
	}
}
