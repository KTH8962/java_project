package day5;

import java.util.Random;
import java.util.Scanner;

public class Day5_Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		String arr[] = {"가위", "바위", "보"};
		int winCnt = 0;
		int loseCnt = 0;
		while(true) {
			int comNum = ran.nextInt(3);
			
			System.out.print("가위(0), 바위(1), 보(2) 입력 : ");
			int num = scan.nextInt();
			System.out.println("Player : " + arr[num]);
			System.out.println("컴퓨터 : " + arr[comNum]);
			if(num == comNum) {
				System.out.println("비겼습니다.");
			} else if(comNum == 2 && num == 0) {
				System.out.println("Player Win!");
				winCnt++;
			} else if(comNum == 0 && num == 2) {
				System.out.println("컴퓨터 Win!");
				loseCnt++;
			} else {
				if(comNum < num) {
					System.out.println("Player Win!");
					winCnt++;
				} else {
					System.out.println("컴퓨터 Win!");
					loseCnt++;
				}
			}
			System.out.println("Player ==> "+ winCnt + "승 " + loseCnt + "패");
			
			System.out.print("재대결(1), 종료(2) : ");
			int exit = scan.nextInt();
			if(exit == 2) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
	}

}
