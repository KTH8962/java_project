package day2;

import java.util.Random;
import java.util.Scanner;

public class Day2_Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		Random ran = new Random();
	
		int count = 0;
		int score = 0;
		for(;;) {
			int ranNum1 = ran.nextInt(8)+2;
			int ranNum2 = ran.nextInt(9)+1;
			int ranNum3 = ranNum1 * ranNum2;
			
			System.out.print(ranNum1 + " * " + ranNum2 + " = ");
			
			int inputNum = s.nextInt();
			if(ranNum3 == inputNum) {
				System.out.println("정답!");
				score++;
			} else {
				System.out.println("오답 ! 정답은 : " + ranNum3 + " 입니다.");
			}
			count++;
			if(count == 5) {
				System.out.println("5문제 풀이 끝");
				System.out.println((20 * score)+"점 입니다!(한문제당 20점)");
				break;
			}
		}
	}

}
