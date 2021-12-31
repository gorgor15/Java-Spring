package ch34;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65);
			fos.write(67);
			fos.write(69);
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("end");
	}
}
