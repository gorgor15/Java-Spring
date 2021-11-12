package ch07;

public class TakeTransTest {
	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentE = new Student("Edward",20000);
		
		Taxi taxi = new Taxi("잘 나간다 운수");
		
		Bus bus = new Bus(100);
		Subway subwaygreen = new Subway(2);
		
		studentJ.takeBus(bus);
		studentT.takeSubway(subwaygreen);
		studentE.takeTaxi(taxi);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		bus.showBusInfo();
		subwaygreen.showSubwayInfo();
		taxi.showTaxiInfo();
	}
}
