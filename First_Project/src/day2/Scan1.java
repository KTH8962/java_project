package day2;

import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		System.out.println(name + "님의 나이는 " +  age + " 입니다.");
		
		scan.close();
	}

}
