package day6;

import java.util.Arrays;

public class Person2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 person = new Person2("홍길동", 30);
		person.setPhone("123-123");
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getPhone());
	}

}
