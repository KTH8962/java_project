package day5;

import java.util.Scanner;

public class Day5_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. 숫자를 1개 입력받고 아래 조건에 맞게 조건문을 작성하시오.
		 조건) 입력받은 숫자가 65~100 사이의 숫자일 경우 '큰 수'
		       30~64 사이의 숫자일 경우 '중간 수'
			   0~29 사이의 숫자일 경우 '작은 수' 라고 출력
			   만약, 100 초과, 0미만의 숫자를 입력할 경우 숫자를 다시 입력하도록 함.*/
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int num = scan.nextInt();
			
			if(num > 100 || num < 0) {
				System.out.print("0 ~ 100 사이의 숫자를 입력해주세요 : ");
			} else if (num >= 65) {
				System.out.println("큰 수");
				break;
			} else if (num >= 30) {
				System.out.println("중간 수");
				break;
			} else {
				System.out.println("작은 수");
				break;
			}			
		}
	}

}
