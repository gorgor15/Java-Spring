package ch33;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		int i;
		try(FileInputStream fis = new FileInputStream("a.txt")){
			while((i=fis.read())!=-1){
				System.out.print((char)i);
			}
			System.out.println("end");
		}catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
