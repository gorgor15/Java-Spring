package ch07;

public class Taxi {
	String taxiName;
	int money;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money += 10000;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiName+"택시 수입은"+money+"입니다.");
	}
}
