package ch32;

import java.util.Scanner;

public class PasswordTest {
	private String password;
	
	
	
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) throws PassWordException{
		if(password==null) {
			throw new PassWordException("비밀번호는 Null 일 수 없습니다.");
		}else if(password.length()<5) {
			throw new PassWordException("비밀번호는 5자 이상이여야 합니다.");
		}else if(password.matches("[a-zA-Z]+")) {
			throw new PassWordException("비밀번호는 숫자나 특수문자를 포함해야 됩니다.");
		}
		this.password = password;
	}



	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		Scanner a = new Scanner(System.in);
		String password = a.next();
		
		try {
			test.setPassword(password);
			System.out.println("에러없음");
		}catch(PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		String passwords = "123412!";
		try {
			test.setPassword(passwords);
			System.out.println(passwords);
			System.out.println("에러없음1");
		}catch(PassWordException e) {
			System.out.println(e.getMessage());
		}
	}
}
