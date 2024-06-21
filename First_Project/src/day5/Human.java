package day5;

public class Human {
	String name;
	int age;
	String addr;
	
	// 생성자를 안만들면 자동으로 Human(){} 생성되어있게된다. 
	Human(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("생성자다!");
	}
	
	void eat(String txt, String food) {
		System.out.println(txt + "밥을 먹었다! " + food + "를(을) 먹었다!");
	}
	
	void study() {
		System.out.println("자바 진짜 재밌다!");
	}
}
