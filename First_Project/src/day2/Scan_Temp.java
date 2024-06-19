package day2;

import java.util.Scanner;

public class Scan_Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 공백이 있기 전까지, 엔터 or 스페이스
		System.out.println("첫번째 텍스트 : ");
		String txt = scan.next(); // test\n
		System.out.println(txt);
		
		// 엔터(\n) 전까지
		scan.nextLine();
		System.out.println("두번째 텍스트 : ");
		String txt2 = scan.nextLine();
		System.out.println(txt2);
		
		scan.close();
	}

}
