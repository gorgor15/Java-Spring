package ch07;

public class Student {
	String name;
	int age;
	int money;
	
	public Student(String name,int money) {
		this.name=name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money-=10000;
	}
	
	public void showInfo() {
		System.out.println(name+"¥‘¿« ≥≤¿∫µ∑¿∫"+money+"¿‘¥œ¥Ÿ.");
	}
	
}
