package firstDay;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 문자 입력 => scan.nextLine();
		// 숫자 입력 => scan.nextInt();
		
		// 사용자로부터 아이디, 이름을 입력받아서
		// "ooo(이름) 님의 아이디는 xxx(아이디) 입니다." 출력
		
		System.out.print("이름를 입력해 주세요 : ");
		String name = scan.nextLine();
		
		System.out.print("아이디를 입력해 주세요 : ");
		String id = scan.nextLine();
		
		System.out.println(name + "님의 아이디는 " + id + " 입니다.");
	}

}
