package day6;

import java.util.Arrays;

public class PersonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("홍길동", 30);
		person.setPhone("123-123");
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getPhone());
	}

}
