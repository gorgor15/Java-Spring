package ch14;

public abstract class Car {
	abstract void drive();
	abstract void stop();
	abstract void wiper();
	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}
	// 변하면 안된다. final로 선언하면 상속받는 클래스에서 재정의를 할수없다.
	final public void run() {
		startCar();
		drive();
		wiper();
		washCar();
		stop();
		turnOff();
	}
}
