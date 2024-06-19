package day2;

import java.util.Scanner;

public class For_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i <= num; i++) {
			if(i > 10) {
				break;
			}
			sum += i; // sum = sum + i;
		}
		
		System.out.println("합은 " + sum + "입니다");
		
		scan.close();
	}

}
