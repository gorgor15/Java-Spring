package ch20;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		// Person person = new Person() 대신 이렇게도 할수있다
		Class c1 = Class.forName("ch20.Person");
		
		Person person = (Person)c1.newInstance();
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance();
		
		System.out.println(p);
	
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
			
		Object[] initargs = {"kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
	}
}
