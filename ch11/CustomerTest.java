package ch11;

public class CustomerTest {
	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		
//		customerLee.setCustomerId(10010);
//		customerLee.setCustomerName("이순신");
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(10020);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
	
	
		//업캐스팅 (Customer꺼만 사용할수있다) 자기타입꺼만 사용가능
		Customer vc = new VIPCustomer();
		
	}
	
	
}	
