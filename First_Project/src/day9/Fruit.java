package day9;

public class Fruit {
	String name;
	private String color;
	private int price;
	
	Fruit(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	
	void getPrice() {
		System.out.println(this.name + "의 가격은 " + this.price + "원 입니다.");
	}
}
