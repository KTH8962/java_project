package day3;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		int ranNum = ran.nextInt(100) + 1;
		
		System.out.print("1 ~ 100 사이의 숫자를 입력하세요 : ");
		
		int num = s.nextInt();
		if(num > ranNum) {
			System.out.println("입력한 수가 더 큽니다.");
		} else if(num == ranNum) {
			System.out.println("두 수가 같습니다.");
		} else {
			System.out.println("입력한 수가 더 작습니다.");
		}
	}
}
