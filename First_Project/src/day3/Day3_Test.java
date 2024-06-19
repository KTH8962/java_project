package day3;

import java.util.Random;
import java.util.Scanner;

public class Day3_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		// 1. 10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력
		/*for(int i = 10; i <= 50; i++) {
			if(i % 3 == 0 && i % 2 == 0) {
				System.out.println(i);
			}
		}*/
		
		// 2.숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력
		/*System.out.print("첫 번째 수 입력 : ");
		int num1 = s.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = s.nextInt();
		
		if((num1 + num2) > 10) {
			System.out.println("큰 수");
		} else {
			System.out.println("작은 수");
		} */
		
		// 3. 숫자를 하나 입력받고, 해당 숫자의 구구단 출력
		// (ex, 2입력시 2*1=2, 2*2=4, 2*3=6 ... 2*9=18 출력)
		/*System.out.print("숫자를 입력해주세요 : ");
		
		int num = s.nextInt();
		
		System.out.println("--- " + num + "단 ---");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}*/
		
		// 4. 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 
		// 큰 수 인지 아닌지 판별하기
		// (ex, 랜덤 수 : 35, 입력 수 : 40 일 경우 '입력한 수가 더 큽니다' 출력, 반대일 경우 작다고 출력)
		/*int ranNum = ran.nextInt(100) + 1;
		System.out.println(ranNum);
		System.out.print("1 ~ 100 사이의 숫자를 입력하세요 : ");
		int inputNum = s.nextInt();
		
		if(inputNum > ranNum) {
			System.out.println("입력한 수가 더 큽니다.");
		} else if(inputNum == ranNum) {
			System.out.println("입력한 수와 같습니다.");
		} else {
			System.out.println("입력한 수가 더 작습니다.");
		}*/
		
		// 5. 1부터 30까지 10~19의 숫자를 제외하고 화면에 출력하시오.
		// (ex, 1 2 3 4 5 6 7 8 9 20 21 22 ... 30)
		/*for(int i = 1; i <= 30; i++) {
			if(i < 10 || i > 19) {
				System.out.println(i);
			}
		}*/
		
		// 6. while 문을 이용하여 2단부터 9단까지 구구단을 출력하시오.
		// 단, 4단과 8단은 출력하지 말 것.
		int i = 2;
		while (i <= 9) {
			int j = 1;
			if(i != 4 && i != 8) {				
				System.out.println("---" + i + "단 ---");
				while (j <= 9) {
					System.out.println(i + " * " + j + " = " + (i * j));
					j++;
				}
			}
			i++;
		}
		
		
		
		
		
		
		
		
		
	}

}
