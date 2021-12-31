package ch34;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');
			char buf[] = {'B','C','D','E','F'};
			
			fw.write(buf);
			fw.write("æ»≥Á«œººø‰");
			fw.write(buf,1,2);
			fw.write("65");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("end");
	}
}
