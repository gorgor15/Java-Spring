package ch35;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Externalizable{
	String name;
	transient String job;
	public Person() {
		
	}
	public Person(String name,String job) {
		this.name=name;
		this.job=job;
	}
	
	public String toString() {
		return name+","+job;
	}
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		obj.writeUTF(name);
		obj.writeUTF(job);
	}
	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = obj.readUTF();
		job = obj.readUTF();
	}
}
public class SerializationTest {
	public static void main(String[] args) {
	
		Person personA = new Person("abort", "무직");
		Person personL = new Person("Lee","대표이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream  ois = new ObjectOutputStream(fos)){
				ois.writeObject(personA);
				ois.writeObject(personL);
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
				Person pLee =(Person)ois.readObject();
				Person pKim = (Person)ois.readObject();
				
				System.out.println(pKim);
				System.out.println(pLee);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
			
	}
}
