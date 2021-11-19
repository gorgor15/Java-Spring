package ch12;

import java.util.ArrayList;

public class CustomerTest1 {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10020, "James");
		Customer customerE = new GoldCustomer(10030, "Edward");
		Customer customerK = new VIPCustomer();
		customerK.customerId=10040;
		customerK.customerName="Kim";
		Customer customerP = new GoldCustomer(10050, "Percy");
		
		customerList.add(customerK);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerT);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님은"+cost+"원을 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는"+customer.bonusPoint+"입니다.");
			
		}
	}
}
