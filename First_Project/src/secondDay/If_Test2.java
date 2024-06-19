package secondDay;

import java.util.Scanner;

public class If_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2개의 숫자를 입력받아서 두 수의 합이 홀수일 경우 
		// '홀수' 출력, 짝수일 경우 '짝수' 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력해 주세요 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두 번째 수를 입력해 주세요 : ");
		int num2 = scan.nextInt();
		
		int result = num1 + num2;
		
		// if((num1 + num2) % 2 == 0)
		if(result % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		scan.close();
	}

}
