package ch12;

public class CustomerTest {
	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		
//		customerLee.setCustomerId(10010);
//		customerLee.setCustomerName("�̼���");
		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo()+"������"+price+"�Դϴ�");

		
		VIPCustomer customerKim = new VIPCustomer();
		price = customerKim.calcPrice(1000);
		customerKim.setCustomerName("������");
		customerKim.setCustomerId(10020);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo()+"������"+price+"�Դϴ�");
	
	
		//��ĳ���� (Customer���� ����Ҽ��ִ�) �ڱ�Ÿ�Բ��� ��밡��
		//calcPrice�� VIPCustomer���� ������ �Ͽ��⶧���� ����� vip�ε� price���� �����°��̴�.
		Customer vc = new VIPCustomer();
		vc.setCustomerId(1000);
		vc.setCustomerName("noname");
		price = vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo()+"������"+price+"�Դϴ�");
	}
	
	
}	
