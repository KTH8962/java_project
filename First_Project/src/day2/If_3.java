package day2;

import java.util.Scanner;

public class If_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num > 100 || num < 0) {
			System.out.println("잘못된 숫자 범위 입니다.");
		} else if(num >= 80) {
			System.out.println("A");
		} else if(num >= 60) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
		scan.close();
	}
}
