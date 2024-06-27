package day9;

public class HumanMain2 {
	static void humanInfo(Human h) {
		System.out.println("이 객체는 "+ h.getClass().getSimpleName() + " 클래스 객체 입니다.");
	}
	
	static void fruitBox(Fruit f) {
		if(f instanceof Orange) {
			System.out.println(f.name + "는 맛있다.");
		} else if(f instanceof Apple) {
			System.out.println(f.name + "는 비싸다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("홍길동", 30);
		Worker w = new Worker("김철수", 20);
		Researcher r = new Researcher("박영희", 25);
		humanInfo(s);
		humanInfo(w);
		humanInfo(r);
		Orange o = new Orange("오렌지", "오렌지색", 1000);
		Apple a = new Apple("사과", "빨간색", 5000);
		fruitBox(o);
		fruitBox(a);
	}

}
