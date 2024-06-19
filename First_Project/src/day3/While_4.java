package day3;

import java.util.Random;
import java.util.Scanner;

public class While_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();		
		int qesNum = 0;
		int score = 0;
		
		while(true) {
			System.out.print("구구단 시작(1), 채점(2), 종료(0) : ");
			// 수정
			int choiceNum = s.nextInt();			
			if(choiceNum == 1) {
				System.out.print("문제 개수를 입력하세요 : ");
				int num = s.nextInt();
				qesNum += num;
				for(int i=1; i <= num; i++) {
					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;
					
					System.out.print(x + " * " + y + " = ");
					
					int answer = s.nextInt();
					if(x*y == answer) {
						System.out.println("정답");
						score++;
					} else {
						System.out.println("오답");
					}
				}			
			} else if(choiceNum == 2) {
				System.out.println("현재까지 " + qesNum + "문제 중에 " + score + "문제 맞추셨습니다.");
			} else if(choiceNum == 0) {
				// 종료
				System.out.println("종료되었습니다.");
				break;
			}			
		}
	}

}
