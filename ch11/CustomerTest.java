package ch11;

public class CustomerTest {
	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		
//		customerLee.setCustomerId(10010);
//		customerLee.setCustomerName("�̼���");
		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCustomerId(10020);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
	
	
		//��ĳ���� (Customer���� ����Ҽ��ִ�) �ڱ�Ÿ�Բ��� ��밡��
		Customer vc = new VIPCustomer();
		
	}
	
	
}	
