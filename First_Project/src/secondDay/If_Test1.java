package secondDay;

import java.util.Scanner;

public class If_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자를 1개 입력받아서 해당 숫자가 50이상이면 "50 이상입니다." 출력
		// 아닐경우 "50 미만입니다." 출력		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num >= 50) {
			System.out.println("50 이상입니다.");
		} else {
			System.out.println("50 미만입니다.");
		}
		
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		scan.close();
	}

}
