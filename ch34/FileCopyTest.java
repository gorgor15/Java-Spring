package ch34;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {
	public static void main(String[] args) throws IOException {
		long millisecond = 0;
		
		try(BufferedInputStream bis =new BufferedInputStream( new FileInputStream("a.zip"));
				BufferedOutputStream bos =new BufferedOutputStream( new FileOutputStream("copy.zip"))){
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i=bis.read())!=-1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println(millisecond + "소요되었습니다.");
		
		Socket socket = new Socket();
		// 보조스트림은 계속 감쌀수있다.
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		 br.readLine();
	}
}
