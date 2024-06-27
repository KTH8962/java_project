package day9;

public class Animal {
	private String name;
	private int age;
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
	}
	
	void sound() {
		System.out.println(this.name + "이(가) 소리를 냅니다.");
	}
}
