package day3;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = s.nextInt();
		
		System.out.println("--- " + num + " 단---");
		for(int i=1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
