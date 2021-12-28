package ch33;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		int i;
		try(FileInputStream fis = new FileInputStream("a.txt")){
			byte bs[] = new byte[10];
			
			while((i = fis.read(bs,1,9))!=-1) {
				// �����ִ� �ڷḦ �б� ���� for���� ����Ѵ�.
				for(int j=0;j<i;j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : "+ i + "����Ʈ ����");
			}
		}catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
