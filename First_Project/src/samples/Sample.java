package samples;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.printf("첫번째 숫자 입력 : ");
			int num1 = scan.nextInt();
			System.out.printf("두번째 숫자 입력 : ");
			int num2 = scan.nextInt();
			try {
				System.out.println(num1 / num2);
				scan.close();
				break;
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}			
		}
		
	}
}
