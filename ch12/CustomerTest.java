package ch12;

public class CustomerTest {
	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		
//		customerLee.setCustomerId(10010);
//		customerLee.setCustomerName("이순신");
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo()+"가격은"+price+"입니다");

		
		VIPCustomer customerKim = new VIPCustomer();
		price = customerKim.calcPrice(1000);
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(10020);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo()+"가격은"+price+"입니다");
	
	
		//업캐스팅 (Customer꺼만 사용할수있다) 자기타입꺼만 사용가능
		//calcPrice는 VIPCustomer에서 재정의 하였기때문에 등급이 vip로된 price값이 나오는것이다.
		Customer vc = new VIPCustomer();
		vc.setCustomerId(1000);
		vc.setCustomerName("noname");
		price = vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo()+"가격은"+price+"입니다");
	}
	
	
}	
