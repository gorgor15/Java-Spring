package ch14;

public abstract class Computer {
	
	//이 클래스에서 구현하지못하니 상속받는 클래스에서 알아서 구현해라
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
	System.out.println("전원을 켭니다.");	
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
