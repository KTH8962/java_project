package day9;

public class FruitMain {
	static void fruitBox(Fruit f) {
		System.out.println(f.name + "을 포장했습니다.");
	}  
	
	public static void main(String[] args) {
		Banana banana = new Banana("바나나", "노란색", 1500);
		Orange orange = new Orange("오렌지", "오렌지색", 1000);
		Apple apple = new Apple("사과", "빨간색", 5000);
		Candy candy = new Candy();
	}

}
