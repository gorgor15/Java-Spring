package ch36;

public class Latte extends Decorator{

	//생성자를 추가해야되는이유는 상위클래스에서 기본생성자가 없기때문이다.
	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print("  Adding Latte");
	}
	
}
