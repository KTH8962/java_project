package day5;

public class Class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, "인천");
		
		//hong.name = "홍길동";		
		System.out.println(hong.name);
		
		hong.eat("아침", "김치찌개");
		hong.study();
		
		Human yu = new Human("유재석", 40, "서울");
		System.out.println(yu.name);
	}

}
