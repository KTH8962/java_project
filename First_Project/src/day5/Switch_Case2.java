package day5;

import java.util.Scanner;

public class Switch_Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		System.out.print("연산자 : ");
		String sym = scan.next();
		
		switch (sym) {
			case "+" : 
				System.out.println(num1 + sym + num2 + " = " + (num1 + num2));
				break;
			case "-" : 
				System.out.println(num1 + sym + num2 + " = " + (num1 - num2));
				break;
			case "*" : 
				System.out.println(num1 + sym + num2 + " = " + (num1 * num2));
				break;
			case "/" : 
				System.out.println(num1 + sym + num2 + " = " + ((double) num1 / num2));
				break;
			default :
				System.out.println("알수없음");
		}
	}

}
