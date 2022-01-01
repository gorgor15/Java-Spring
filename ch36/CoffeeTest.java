package ch36;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee etiopia = new EtiopiaAmericano();
		etiopia.brewing();
		
		System.out.println("===============");
		Coffee Latte = new Latte(new KeyaAmericano());
		Latte.brewing();
		System.out.println("===============");
		
		System.out.println("===============");
		Coffee mocha = new Mocha(new Latte(new EtiopiaAmericano()));
		mocha.brewing();
		System.out.println("===============");
		Coffee keyaCoffee = new WhippingCream(new Mocha(new Latte(new KeyaAmericano())));
		keyaCoffee.brewing();
		
		
	}
	
}
