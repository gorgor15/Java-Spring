package ch36;

public class Mocha extends Decorator{

	public Mocha(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	public void brewing() {
		super.brewing();
		System.out.println("Adding Mocha");
	}
}
