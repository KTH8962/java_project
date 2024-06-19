package day2;

import java.util.Scanner;

public class If_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		// 3 mod 2, 3 % 2
		if(num % 2 == 1) {
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("짝수 입니다.");
		}
		
		scan.close();
	}

}
