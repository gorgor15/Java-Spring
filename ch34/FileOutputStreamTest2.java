package ch34;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("output3.txt",true);
		
		try(fos){
			byte arr[] = new byte[30];
			byte data = 65;
			for(int i=0;i<arr.length;i++) {
				arr[i]= data++;
				
			}
			fos.write(arr,2,10);
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("end");
	}
}
