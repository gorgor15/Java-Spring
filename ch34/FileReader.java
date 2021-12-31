package ch34;

import java.io.IOException;
public class FileReader {
	public static void main(String[] args) {
		try(java.io.FileReader fis = new java.io.FileReader("Reader.txt")){
			int i;
			while((i= fis.read())!=-1) {
				System.out.println((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
