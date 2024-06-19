package day2;

import java.util.Random;
import java.util.Scanner;

public class Day2_Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		Random ran = new Random();
		
		
		for(;;) {
			System.out.print("문제 수를 입력해주세요 : ");
			int que = s.nextInt();
			int score = 0;
			
			for(int i = 1; i <= que; i++) {
				int ranNum1 = ran.nextInt(8) + 2;
				int ranNum2 = ran.nextInt(9) + 1;
				int ranNum3 = ranNum1 * ranNum2;
				
				System.out.print(ranNum1 + " * " + ranNum2 + " = ");
				
				int inputNum = s.nextInt();
				if(inputNum == ranNum3) {
					System.out.println("정답.");
					score++;
				} else {
					System.out.println("오답. 정답은 " + ranNum3 + "입니다.");
				}
			}
			
			System.out.println("총 " + que + "문제 중 " + score + "개 정답!");
			System.out.println("계속 하시려면 아무키를 입력해주세요. 종료는 0을 입력해주세요.");
			int exit = s.nextInt();
			if(exit == 0) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

}
