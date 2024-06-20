package day3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int x = s.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int y = s.nextInt();
		
		// 삼항연산자 (if ~ else 쉽게)
		//String txt = x+y >= 10 ? "큰 수" : "작은 수";
		//System.out.println(txt);
		
		if(x+y >= 10) {
			System.out.println("큰 수");
		} else {
			System.out.println("작은 수");
		}
		
	}

}
