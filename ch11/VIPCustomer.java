package ch11;

public class VIPCustomer extends Customer{
	private int agentId;
	

	double salesRatio;
	
	public VIPCustomer() {
		super(0,"No-Name");
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer ������ ȣ��");
		
	}
	
	public int getAgentId() {
		return agentId;
	}
}
