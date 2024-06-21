package day5;

import java.util.Scanner;

public class Day5_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 숫자를 1개 입력받고 해당 숫자가 홀수 인지 짝수 인지 판별하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
