package ch05;

public class UserInfo {
	String userId;
	String userPassword;
	String userName;
	String userAddress;
	String userNumber;
	
	public UserInfo() {
		
	}
	
	public UserInfo(String userId,String userPassword,String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		
	}
	
	public String showUserInfo() {
		return "������ ���̵��" + userId + "�̰�, ��ϵ� �̸���" + userName + "�Դϴ�";
		
	}
}
