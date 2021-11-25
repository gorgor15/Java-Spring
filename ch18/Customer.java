package ch18;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("판매하였습니다.");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("구매하였습니다.");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("Customer order");
	}
	
	public void hello() {
		System.out.println("Hello");
	}

}
