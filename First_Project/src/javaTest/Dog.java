package javaTest;

public class Dog extends Animal{
	// 1. 에러가 발생하지 않도록 생성자 작성(name, age 초기화)
	// 2. 해당 클래스(Dog)의 객체 생성 후 sound 메소드 호출 시 '멍멍'이 출력되도록 코드를 작성할 것
	Dog(String name, int age) {
		super(name, age);
	}
	
	public void sound() {
		System.out.println("멍멍");
	}
}
