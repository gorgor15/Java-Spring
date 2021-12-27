package ch31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
	public static void main(String[] args) {
//		FileInputStream fls = null;
		
		
		//try()안에 쓰면 close까지 같이된다.
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			System.out.println("read");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
