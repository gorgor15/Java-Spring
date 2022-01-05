package ch37;

class Banks{
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public synchronized void saveMoney(int save) {
		int m = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m+save);
	}
	
	public synchronized void minusMoney(int minus) {
		int m = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m-minus);	
	}
}

class Parks extends Thread{
	@Override
	public void run() {
		
		System.out.println("Start save");
		SyncMainTest.banks.saveMoney(3000);
		
		System.out.println("saveMoney(3000) : "+SyncMainTest.banks.getMoney());
	}
	
}

class ParksWife extends Thread{
	@Override
	public void run() {
		System.out.println("Start minus");
		SyncMainTest.banks.minusMoney(1000);
		System.out.println("MinusMoney(1000) : "+SyncMainTest.banks.getMoney());
		
	}
}
public class SyncMainTest {
	public static Banks banks = new Banks();
	public static void main(String[] args) {
		Parks parks = new Parks();
		ParksWife wifes = new ParksWife();
		parks.start();
		wifes.start();
	}
}
