package ch31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	//throws는 예외처리를 미루겠다. (loadClass 메소드를 사용하는쪽에서 에러를 핸들링하겠다.)
	public Class loadClass(String fileName,String className) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}
