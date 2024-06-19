package firstDay;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl + shift + o
		Scanner scan = new Scanner(System.in);
		// 객체 = 변수 + 메소드
		System.out.print("이름을 입력하세요 : ");
		String name = scan.nextLine(); // 문자를 입력받는 함수

		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "입니다.");
	}

}
