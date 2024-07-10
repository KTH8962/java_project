package javaTest;

import java.util.Random;
import java.util.Scanner;

public class Java_Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("구구단 문제 시작");
		
		
		while(true) {
			int answerCnt = 0;
			int wrongCnt = 0;
			for(int i = 1; i <= 5; i++) {
				int num1 = ran.nextInt(8)+2;
				int num2 = ran.nextInt(9)+1;
				System.out.print(num1 + " * " + num2 + " = ");
				int answer = scan.nextInt();
				
				if(answer == (num1 * num2)) {
					System.out.println("정답!");
					answerCnt++;
				} else {
					System.out.println("오답!");
					wrongCnt++;
				}				
			}
			if(answerCnt >= 3) {
				System.out.println("통과했습니다.");
				break;
			} else {
				System.out.println("불합겹 입니다. 재시험에 응시해 주세요.");
			}
			
		}
	}

}
