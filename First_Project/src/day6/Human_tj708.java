package day6;

public class Human_tj708 {
	String name;
	int age;
	String addr;
	static int money708;
	
	static void staticName() { // 어떠한 객체의 name을 변경 하는지 알 수 없기에 오류이다.
		//name = "유재석";
		money708 = 130000; // static변수 이기에 접근 가능하다.
}
	
	// 생성자를 안만들면 자동으로 Human(){} 생성되어있게된다. 
	Human_tj708(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		money708 = 150000;
	}
	
	void eat(String txt, String food) {
		System.out.println(txt + "밥을 먹었다! " + food + "를(을) 먹었다!");
	}
	
	void study() {
		System.out.println("자바 진짜 재밌다!");
	}
}
