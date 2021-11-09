package ch05;

public class UserInfoTest {
	public static void main(String[] args) {
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassword= "zxcv1234";
		userLee.userName = "Lee";
		userLee.userNumber = "01011112222";
		userLee.userAddress = "Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("b12345","09854xzc","Kim");
		System.out.println(userKim.showUserInfo());
	}
}
