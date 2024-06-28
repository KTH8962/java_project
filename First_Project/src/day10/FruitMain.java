package day10;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple("사과", "빨간색", 1000);
		Banana banana = new Banana("바나나", "노란색", 1000);
		
		apple.print();
		banana.print();
		
		// toString을 오버라이딩해서 같은 결과로 나온다.
		System.out.println(apple);
		System.out.println(apple.toString());
		
		Object obj[] = new Object[3];
		obj[0] = "홍길동";
		obj[1] = banana;
		int a = 10;
		obj[2] = a; // 자동 박싱되어 적용
		
		String number = "123";
		int number2 =Integer.parseInt(number);
		int number3 = number2 + 50;
		
	}

}
