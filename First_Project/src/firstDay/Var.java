package firstDay;

public class Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		int age = 30;
		int stuNum = 20241234;
		double height = 170.1; // float는 170.1f f를 붙여줘야함
		String phone = "010-1234-1234";
		
		char word = 'a';
		String word2 = "a";
		
		boolean flg = true; // false
		boolean flg2 = age > 20;
		
		// String(문자열), int(정수), double(실수), boolean(참거짓)
		System.out.println(name + " " + age + " " + stuNum + " " + height + " " + phone + " " + flg + " " + flg2);
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println(age > 20);
		System.out.println(age >= 30);
		System.out.println(age < 20);
		System.out.println(age <= 30);
	}

}
